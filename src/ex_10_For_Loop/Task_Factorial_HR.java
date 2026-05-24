package ex_10_For_Loop;

import java.util.Scanner;

public class Task_Factorial_HR {

    public static void main() {

/*     Factorial of n = n! = n × (n - 1) × (n - 2) × ... × 1
*      Examples:
        0! = 1
        1! = 1
        3! = 3 x 2 x 1 = 6
        4! = 4 x 3 x 2 x 1 =  24
*
* */
        System.out.println("Welcome to the Factorial Program");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number : ");

        int fact =1;

        if(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println(n);

            for (int i = 1; i <= n; i++) {

                fact = fact * i;
            }
            System.out.println("factorial is :" + fact);
        }

else {
            System.out.println("Enter a valid positive integer");
        }

scanner.close();
        }




    }

