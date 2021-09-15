package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Program determines if entered year is a leap year or not");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");

        try {
            int year = input.nextInt();

            System.out.printf("%d is %s leap year", year, isLeapYear(year) ? 'a' : "not a");
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Invalid year was entered.");
        }
    }

    /**
     * @param year specified year.
     *
     * @return boolean whether year is a leap year or not.
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
