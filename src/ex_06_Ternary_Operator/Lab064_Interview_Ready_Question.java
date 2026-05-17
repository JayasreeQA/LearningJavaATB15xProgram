package ex_06_Ternary_Operator;

import java.sql.SQLOutput;
public class Lab064_Interview_Ready_Question {

   public static void main() {
       int amol_age= 21;
       String result = (amol_age >18)?((amol_age>25) ?"Can go to Goa and drink": "Can go to Goa but cannot drink") : "Cannot go to Goa";
       System.out.println(result);

    }

}
