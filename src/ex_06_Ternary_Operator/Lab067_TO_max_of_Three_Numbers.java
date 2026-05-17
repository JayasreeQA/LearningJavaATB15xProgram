package ex_06_Ternary_Operator;

public class Lab067_TO_max_of_Three_Numbers {

    public static void main() {
        int integer1=20;
        int integer2=100;
        int integer3=5;

        int result2 =(integer1>integer2)? ((integer1>integer3)? integer1: integer3) : ((integer2>integer3)? integer2: integer3);
        System.out.println(result2);

    }


}
