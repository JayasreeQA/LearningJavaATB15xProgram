package ex_09_Switch;

public class Lab093_JDK13Above {

    public static void main() {
        // in JDK > 13
// this format of switch statement is applicable from jdk 13 onwards. And it is working fine without break also.
        int  itemcode=001;

        switch(itemcode){
            case 001 -> System.out.println("item code is : "+itemcode);
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");

        }
    }
}
