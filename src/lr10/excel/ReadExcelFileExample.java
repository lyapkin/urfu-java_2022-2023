package lr10.excel;

import org.apache.poi.EmptyFileException;
import org.apache.poi.openxml4j.exceptions.NotOfficeXmlFileException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelFileExample {
    public static void main(String[] args) {
        try {
            String filePath = "src/lr10/excel/example.xlsx";
            FileInputStream inputStream = new FileInputStream(filePath);

            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

            XSSFSheet sheet = workbook.getSheet("Товары");

            if (sheet != null) {
                for (Row row : sheet) {
                    for (Cell cell : row) {
                        System.out.print(cell.toString() + "\t");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Таблица не соделжит данного листа.");
            }

            workbook.close();
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Данного файла не существует. Проверьте название файла или создайте файл.");
        } catch (EmptyFileException e) {
            System.out.println("Файл не содержит данных.");
        } catch (NotOfficeXmlFileException e) {
            System.out.println("Данные файла записаны в неверном формате.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
