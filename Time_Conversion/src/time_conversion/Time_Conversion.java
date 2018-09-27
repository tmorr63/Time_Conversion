package time_conversion;

import java.util.Scanner; //Starts the Scanner

public class Time_Conversion {


    public static void main(String[] args) {
        System.out.println("Hello. How many minutes do you have? ");

        Scanner input = new Scanner(System.in);

        int minute = input.nextInt(); //minutes the user decides

        int days = minute / 1440;
        int aboveDays = minute % 1440;
        int hours = aboveDays / 60;
        int aboveHours = aboveDays % 60;
        int extra = aboveHours;

        System.out.println("That is " + days + " days, " + hours + " hours, and " + extra + " minutes.");



    }

}