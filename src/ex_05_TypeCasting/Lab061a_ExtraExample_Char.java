package ex_05_TypeCasting;

public class Lab061a_ExtraExample_Char {

    public static void main() {

        char ch = 'A';

        int ascii = ch; // widening - implicit
        System.out.println(ascii);

        int num =65;
         char letter = (char)num; // Narrowing Typecasting - Explicit

        System.out.println(num);



    }
}
