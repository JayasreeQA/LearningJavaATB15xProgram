package ex_05_TypeCasting;

public class Lab060_TypeCasting {


    public static void main(String [] args) {

        long phone = 1234567891;
        //short s= phone; Narrowing typecasting - Implicit
        short s1 = (short) phone; // Narrowing typecasting - Explicit

        System.out.println(s1);


    }
}
