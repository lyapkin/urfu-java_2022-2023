package lr10.html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NewsParser {
    private static boolean success = false;
    private static Document doc;
    public static void main(String[] args) {
        try {
            while (!success) {
                connect();
            }


            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            org.w3c.dom.Document docXML = docBuilder.newDocument();
            org.w3c.dom.Element rootElement = docXML.createElement("newsList");
            docXML.appendChild(rootElement);


            Elements newsParent = doc
                    .select("tr:has(> td.blocktitle:first-child + td.blockdate:last-child)");
            for (int i = 0; i < 10; i++) {
                List<String> strings = newsParent.get(i).children().stream()
                        .filter(item -> item.hasAttr("class"))
                        .map(item -> item.childNodes().get(0).toString())
                        .collect(Collectors.toList());

                System.out.println("Тема: " + strings.get(0));
                System.out.println("Дата: " + strings.get(1) + "\n");

                // Создание XML элемента
                org.w3c.dom.Element titleXML = docXML.createElement("title");
                titleXML.appendChild(docXML.createTextNode(strings.get(0)));
                org.w3c.dom.Element dateXML = docXML.createElement("date");
                dateXML.appendChild(docXML.createTextNode(strings.get(0)));
                org.w3c.dom.Element news = docXML.createElement("newsItem");
                news.appendChild(titleXML);
                news.appendChild(dateXML);
                rootElement.appendChild(news);
            }

            // Запись новостей в файл
            docXML.normalizeDocument();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(docXML);
            StreamResult result = new StreamResult(new File("src/lr10/html/news.xml"));
            transformer.transform(source, result);

            System.out.println("Создан файл с новостями.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void connect() {
        try {
            doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
            success = true;
        } catch (IOException e) {
            System.out.println("Неуспешное соединение. Попробовать еще? (\"1\" - да)");
            Scanner in = new Scanner(System.in);
            String answr = in.nextLine();
            switch (answr) {
                case "1":
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
