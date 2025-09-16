package urok;

import java.util.Calendar;
import java.util.Date;

public class MainDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        long mmc = date.getTime();

        System.out.println(mmc);

        String[] months = {"January", "February", "Mart", "April", "May", "June", "July", "August",
        "September", "October", "November", "December"};

        Calendar calendar = Calendar.getInstance();

        System.out.println("Current Month: " + months[calendar.get(Calendar.MONTH)]);
        System.out.println("Current Date: " + calendar.get(Calendar.DATE));

        int current_date = calendar.get(Calendar.DATE);
        String current_month = months[calendar.get(Calendar.MONTH)];
        System.out.println("Date: " + " " + current_month + " " + current_date);
    }
}
