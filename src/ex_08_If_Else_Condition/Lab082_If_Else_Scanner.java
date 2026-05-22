package ex_08_If_Else_Condition;

import java.util.Scanner;

public class Lab082_If_Else_Scanner {

    public static void main() {

        // Allowed to vote or not - age
        // If age > 18 -> allowed to vote.
        // else age < >18 -> Not allowed to vote.

        // How to take the user Input
        // 1. CLI Options
        // 2. Using scanner class
//        int age = Integer.parseInt(args[0]);

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter you age in numbers : ");
        int age = scanner.nextInt();

        // double d = scanner.nextDouble();
        // float f = scanner.nextFloat();

        System.out.println(age);

        if(age>18){
            System.out.println("Allowed to vote");
        }
else{
            System.out.println("Not allowed to vote");
        }
    }
}
