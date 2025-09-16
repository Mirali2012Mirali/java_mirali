package urok;

import java.util.*;
import java.time.*;

public class Homework {
    public static void main(String[] args) {

        Date now = new Date();
        System.out.println("Текущая дата и время: " + now);

        Date Jan2000 = new Date();
        System.out.println("1 января 2000 года: " + Jan2000);

        Calendar calendar = Calendar.getInstance();
        System.out.println("Год: " + calendar.get(Calendar.YEAR));
        System.out.println("Месяц: " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("День месяца: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("День недели: " + calendar.get(Calendar.DAY_OF_WEEK));

        calendar.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("Через 10 дней: " + calendar.getTime());

        Calendar birthday = Calendar.getInstance();
        birthday.set(2011, Calendar.JUNE, 13);
        int DayOfWeek = birthday.get(Calendar.DAY_OF_WEEK);
        System.out.println("13 июня 2011 был день недели: " + DayOfWeek);

        LocalDate today = LocalDate.now();
        System.out.println("Сегодня: " + today);

        System.out.println("Номер дня в году: " + today.getDayOfYear());

        LocalDate Plus100 = today.plusDays(100);
        System.out.println("Через 100 дней: " +Plus100);
        System.out.println("Это будет день недели: " + Plus100.getDayOfWeek());

        LocalDate End2025 = LocalDate.of(2025, 12, 31);
        System.out.println("31 декабря 2025:");
        System.out.println("День недели: " + End2025.getDayOfWeek());
        System.out.println("Номер дня в году: " + End2025.getDayOfYear());
    }
}

