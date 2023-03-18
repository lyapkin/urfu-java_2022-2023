package lr10.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class XMLParser {
    private static File inputFile;
    private static boolean stop = false;
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            // Чтение данных из файла
            inputFile = new File("src/lr10/xml/example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            System.out.println("Корневой элемент: "  + doc.getDocumentElement().getNodeName());

            // Вывод книг в консоль
            NodeList nodeList = doc.getElementsByTagName("book");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                System.out.println("\nТекущий элемент: " + node.getNodeName());

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    System.out.println("Название книги: " + element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Автор: " + element.getElementsByTagName("author").item(0).getTextContent());
                    System.out.println("Год издания: " + element.getElementsByTagName("year").item(0).getTextContent());
                }
            }

            // Выполнение дополнительных команд
            while (!stop) {
                System.out.println("\nКоманды:\n" +
                        "\"a\" - добавить новую книгу\n" +
                        "\"r\" - удалить книгу\n" +
                        "\"f\" - найти книгу\n" +
                        "\"e\" - остановить программу\n" +
                        "Введите команду:");
                String command = in.nextLine();

                switch (command) {
                    case "e":
                        System.exit(0);
                        break;
                    case "a":
                        addXMLItem(doc);
                        break;
                    case "r":
                        removeXMLItem(doc);
                        break;
                    case "f":
                        findXMLItem(doc);
                        break;
                    default:
                        System.out.println("Команда не распознана.");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файла с книгами не существует. Создайте файл при помощи CreateXMLFile.\n" + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addXMLItem(Document doc) {
        try {
            Element root = doc.getDocumentElement();
            Element book = doc.createElement("book");

            // Получение данных книги и создание элементов с данными
            System.out.println("Введите название книги: ");
            String titleName = in.nextLine();
            Element title = doc.createElement("title");
            title.appendChild(doc.createTextNode(titleName));
            book.appendChild(title);

            System.out.println("Введите имя автора: ");
            String authorName = in.nextLine();
            Element author = doc.createElement("author");
            author.appendChild(doc.createTextNode(authorName));
            book.appendChild(author);

            System.out.println("Введите год издания: ");
            int yearPub = in.nextInt();
            in.nextLine();
            Element year = doc.createElement("year");
            year.appendChild(doc.createTextNode(String.valueOf(yearPub)));
            book.appendChild(year);

            root.appendChild(book);

            // Запись книги в файл
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(inputFile);
            transformer.transform(source, result);

            System.out.println("Книга успешно добавлена.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void findXMLItem(Document doc) {
        try {
            System.out.println("Введите автора книги (или оставьте пустую строку):");
            String authorSearch = in.nextLine().trim();

            System.out.println("Введите год издания книги (или оставьте пустую строку):");
            String yearSearch = in.nextLine().trim();

            List<Element> books;
            NodeList nodeList = doc.getElementsByTagName("book");

            // Поиск книг с заданными параметрами
            books = Stream.iterate(0, i -> i < nodeList.getLength(), i -> i + 1)
                    .map(nodeList::item)
                    .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                    .map(node -> (Element) node)
                    .filter(element -> {
                        String author = element.getElementsByTagName("author").item(0).getTextContent().toLowerCase();
                        String year = element.getElementsByTagName("year").item(0).getTextContent();
                        return author.contains(authorSearch.toLowerCase()) && year.contains(yearSearch);
                    }).collect(Collectors.toList());

            // Вывод в консоль найденных книг
            if (books.isEmpty()) {
                System.out.println("Нет книг с такими параметрами.");
            } else {
                for (Element element : books) {
                    System.out.println("\n");
                    System.out.println("Название книги: " + element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Автор: " + element.getElementsByTagName("author").item(0).getTextContent());
                    System.out.println("Год издания: " + element.getElementsByTagName("year").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void removeXMLItem(Document doc) {
        try {
            System.out.println("Введите название книги, которую хотите удалить:");
            String bookName = in.nextLine().trim();
            NodeList nodeList = doc.getElementsByTagName("book");

            // Поиск книги
            Optional<Node> nodeToRemove = Stream.iterate(0, i -> i < nodeList.getLength(), i -> i + 1)
                    .map(nodeList::item).filter(node -> {
                        Element element = (Element) node;
                        return (node.getNodeType() == Node.ELEMENT_NODE &&
                                element.getElementsByTagName("title").item(0).getTextContent().equalsIgnoreCase(bookName));
                    }).findFirst();

            // Удаление книги, если найдена и обновление файла
            if (nodeToRemove.isPresent()) {
                nodeToRemove.get().getParentNode().removeChild(nodeToRemove.get());

                Transformer transformer = TransformerFactory.newInstance().newTransformer();
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(inputFile);
                transformer.transform(source, result);

                System.out.println("Книга успешно удалена.");
            } else {
                System.out.println("Нет книги с названием " + bookName + ".");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
