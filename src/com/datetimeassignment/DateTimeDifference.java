package com.practive;



import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class DateTimeDifference {

    public static String dateDifference(Scanner sc) {
        System.out.println("Enter your Start date :");
        String startDate = sc.nextLine();

        System.out.println("Enter Your End Date :");
        String endDate = sc.nextLine();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date1 = LocalDate.parse(startDate,dateTimeFormatter);
        LocalDate date2 = LocalDate.parse(endDate,dateTimeFormatter);

        Period period = Period.between(date1, date2);

        return "The Difference between start date and end date is :" + period.getYears() + " Years " + period.getMonths()
                + " Months " + period.getDays() + " Days ";

    }

    public static String timeDifference(Scanner sc){
        System.out.println("Enter your Start time :");
        String startTime = sc.nextLine();

        System.out.println("Enter Your End Time :");
        String endTime = sc.nextLine();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime time1 = LocalTime.parse(startTime, dateTimeFormatter);
        LocalTime time2 = LocalTime.parse(endTime,dateTimeFormatter);

        Duration duration = Duration.between(time1, time2);

        return "The Time Difference betweeen start time and end time is : "+ duration.toHours() + " Hours "+ duration.toMinutes()%60 + " Minutes "+ duration.getSeconds()%60 + " Seconds ";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String result = dateDifference(sc);
        // System.out.println(result);

        String result1 = timeDifference(sc);
        System.out.println(result1);
    }

}
