import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utils {

    public static String input() { // ввод данных
        String text = "";
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            text = reader.readLine();

            if (text.equals("EU")) {
                return "EUR";
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        return text;
    }

    public static LocalDate converterDate(String text) {    // перевод String в форма LocalDate

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd.MM,yy");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            if (text.matches("(.*),(.*)")) {
                return LocalDate.parse(text, dateTimeFormatter1);
            }
        else if (text.matches("(.*)\\.(.*)")) {
                return LocalDate.parse(text, dateTimeFormatter2);
            }
            else if (text.length() == 10) {
                return LocalDate.parse(text,dateTimeFormatter3);
            }
            else return LocalDate.parse(text, dateTimeFormatter);
        }
        catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

}
