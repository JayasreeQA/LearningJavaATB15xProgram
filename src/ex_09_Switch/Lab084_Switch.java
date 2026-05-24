package ex_09_Switch;

import java.util.Scanner;

public class Lab084_Switch {

    public static void main() {
        // You need to take a user input and ask for the integer from 1 to 7.
        // And if user enters 1 to 7,
        // you will tell which day it is.

        // Logic Building Formula

        // Step 1 - Number one is using the Scanner class.
        // Step 2 number two will be basically figuring out the expression and the day.
        // Step 3- We will basically add step 3 as a rough logic.
        // Step 4 - 4 is you will write the fix the logic and optimize.
        // Step 5 - figure out the edge cases.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7 for the day program");

        if (scanner.hasNextInt()) {

            int day = scanner.nextInt();
            switch (day) {

                case 1: {
                    System.out.println("Mon");
                    break;
                }
                case 2: {
                    System.out.println("Tues");
                    break;
                }
                case 3: {
                    System.out.println("Wed");
                    break;
                }
                case 4: {
                    System.out.println("Thurs");
                    break;
                }
                case 5: {
                    System.out.println("Fri");
                    break;
                }
                case 6: {
                    System.out.println("Sat");
                    break;
                }
                case 7: {
                    System.out.println("Sun");
                    break;
                }

                default: {
                    System.out.println("Give valid no");
                    break;
                }
            }

        }
        else {
            System.out.println("Invalid int is entered!");
        }
    }
}
