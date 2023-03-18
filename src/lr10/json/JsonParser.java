package lr10.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JsonParser {
    private static JSONObject jsonObject;
    private static JSONArray jsonArray;
    private static boolean stop = false;
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lr10/json/example.json"));
            jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            jsonArray = (JSONArray) jsonObject.get("books");

            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("\nТекущий элемент: book");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("Автор: " + book.get("author"));
                System.out.println("Год издания: " + book.get("year"));
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
                        addJSONItem();
                        break;
                    case "r":
                        removeJSONItem();
                        break;
                    case "f":
                        findJSONItem();
                        break;
                    default:
                        System.out.println("Команда не распознана.");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файла с книгами не существует. Создайте файл при помощи JSONCreator.\n" + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addJSONItem() {
        JSONObject book = new JSONObject();

        System.out.println("Введите название книги: ");
        String titleName = in.nextLine();
        book.put("title", titleName);

        System.out.println("Введите имя автора: ");
        String authorName = in.nextLine();
        book.put("author", authorName);

        System.out.println("Введите год издания: ");
        int yearPub = in.nextInt();
        in.nextLine();
        book.put("year", String.valueOf(yearPub));

        jsonArray.add(book);

        jsonObject.replace("books", jsonArray);

        try (FileWriter file = new FileWriter("src/lr10/json/example.json")) {
            file.write(jsonObject.toJSONString());
            System.out.println("Книга успешно добавлена.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void findJSONItem() {
        System.out.println("Введите автора книги (или оставьте пустую строку):");
        String authorSearch = in.nextLine().trim();

        System.out.println("Введите год издания книги (или оставьте пустую строку):");
        String yearSearch = in.nextLine().trim();

        List<Object> books = (List<Object>) jsonArray;
        List<JSONObject> foundBooks = books.stream()
                .filter(book -> book instanceof JSONObject)
                .map(book -> (JSONObject) book)
                .filter(book -> book.get("author").toString().toLowerCase().contains(authorSearch.toLowerCase())
                    && book.get("year").toString().contains(yearSearch))
                .collect(Collectors.toList());

        if (foundBooks.isEmpty()) {
            System.out.println("Нет книги с такими параметрами.");
        } else {
            foundBooks.stream().forEach(book -> {
                System.out.println("\nТекущий элемент: book");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("Автор: " + book.get("author"));
                System.out.println("Год издания: " + book.get("year"));
            });
        }
    }

    private static void removeJSONItem() {
        System.out.println("Введите название книги, которую хотите удалить:");
        String bookName = in.nextLine().trim();

        Iterator iterator = jsonArray.iterator();
        while (iterator.hasNext()) {
            JSONObject book = (JSONObject) iterator.next();
            if (bookName.equalsIgnoreCase(book.get("title").toString())) {
                iterator.remove();
            }
        }

        try (FileWriter file = new FileWriter("src/lr10/json/example.json")) {
            file.write(jsonObject.toJSONString());
            System.out.println("Книга успешно удалена.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
