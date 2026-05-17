package ex_05_TypeCasting;

import java.sql.SQLOutput;

public class Lab061_TypeCasting_Used {

   public static void main(String [] args) {

       int course = 100;
       float NSRT_GST = 18.45f;

       //int total= course+ NSRT_GST;// Narrowing -Implicit
    int total= course +(int) NSRT_GST; // Narrowing - explicit
       System.out.println(total);  // output- 118

       float total2 = course + NSRT_GST; // widening - Implicit
       float total3 = (float)course +NSRT_GST;

       System.out.println(total2);
       System.out.println(total3);








    }

}
