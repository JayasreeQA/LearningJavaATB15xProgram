package ex_10_For_Loop;

import java.util.Scanner;

public class Lab112_For_loop_Continue {

    public static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number= scanner.nextInt();

        for(int i =0;i< number;i++) {

            if(i==5){
                continue;  // so continue will skip 5 and will not execute the below statement
            }
            System.out.println(i);

        }
    }
}
