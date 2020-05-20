import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

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

        DateTimeFormatter dfs = new DateTimeFormatterBuilder()
                .appendOptional(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                .appendOptional(DateTimeFormatter.ofPattern("dd/MM/yy"))
                .appendOptional(DateTimeFormatter.ofPattern("dd.MM,yy"))
                .appendOptional(DateTimeFormatter.ofPattern("dd.MM.yyyy"))

                .toFormatter();


        LocalDate date = LocalDate.parse(text,dfs);

        return date;
    }


}
