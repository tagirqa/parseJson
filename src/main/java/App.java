import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;


public class App {


    private static class LocalDateDeserializer implements JsonDeserializer<LocalDate> {
        @Override
        public LocalDate deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
                throws JsonParseException {
            return LocalDate.parse(json.getAsString(),
                    DateTimeFormatter.ofPattern("yyyy-MM-dd").withLocale(Locale.ENGLISH));
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(LocalDate.class, new LocalDateDeserializer());
        Gson gson = gsonBuilder.setPrettyPrinting().create();

        List<Company> companyList;
        companyList = gson.fromJson(new FileReader(new File("test.json")),
                new TypeToken<List<Company>>(){}.getType());

        companyList.forEach((s) -> System.out.println(s.getNameShort()      // Вывести все имеющиеся компании
                + "- Дата основания: " + s.getDateCreate().format(DateTimeFormatter.ofPattern("dd/MM/yy"))));

        System.out.println();

        System.out.println("Всего бумаг: " + companyList.stream().flatMap(x->x.getSecurities(). // Выводим количество просроченых бумаг
                stream().filter(a-> a.getDateTo().isBefore(LocalDate.now()))).count());

        companyList.forEach(x->x.getSecurities().stream().   // Вывести все просроченные ценные бумаги
                filter(a-> a.getDateTo().isBefore(LocalDate.now())).
                forEach(b -> System.out.println("Код: " + b.getCode() + ", Дата истичения: " + b.getDateTo() + ", Организация: " + x.getNameFull())));



        System.out.println();

        LocalDate date = Utils.converterDate(Utils.input());
        companyList.stream().filter(x-> x.getDateCreate().isAfter(date)). // вывод организацций по дате создания основанных после введенной даты
                forEach(x-> System.out.println("Организация: " + x.getNameFull() + ", Дата создания: " + x.getDateCreate()));

        System.out.println();

        String fileName = Utils.input(); // записываем данные на вход EU/RUB/USD
        System.out.println("Ценные бумаги использующие валюту: " + fileName);
        companyList.forEach(x->x.getSecurities().stream(). // ответ на запрос пользователя ввиду валюты
                filter(a-> a.getCurrency().getCode().equals(fileName)).
        forEach(b -> System.out.println(b.getId() + " " + b.getCode())));

    }
}
