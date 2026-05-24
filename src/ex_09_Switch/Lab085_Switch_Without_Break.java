package ex_09_Switch;

import java.util.Scanner;

public class Lab085_Switch_Without_Break {

    public static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter no");

        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();

            switch (day) {

                case 1: {
                    System.out.println("Mon");

                }

                // without break it will execute all cases
                case 2: {
                    System.out.println("Tues");

                }
                case 3: {
                    System.out.println("Wed");

                }
                case 4: {
                    System.out.println("Thurs");

                }
                case 5: {
                    System.out.println("Fri");

                }
                case 6: {
                    System.out.println("Sat");

                }
                case 7: {
                    System.out.println("Sun");

                }

                default: {
                    System.out.println("Give valid no");

                }
            }

        }
        else {

            System.out.println("enter valid no");

        }
    }
}
