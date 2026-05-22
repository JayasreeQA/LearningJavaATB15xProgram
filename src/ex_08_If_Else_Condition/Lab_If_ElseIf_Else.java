package ex_08_If_Else_Condition;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_If_ElseIf_Else {

    public static void main(String [] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("enter age");
        int age= scanner.nextInt();

        System.out.println("Enter name : ");
        String name=scanner.next();

        if(age>34){
            System.out.println("age>34");
        }

        else if (age<34){
            System.out.println("age<34");
        }

        else{
            System.out.println("age==34");
        }




    }
}
