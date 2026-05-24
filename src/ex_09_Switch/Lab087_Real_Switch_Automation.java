package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {


    public static void main() {

        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter browser : ");

        String browser=scanner.next();
        browser= browser.toLowerCase();   //Converts all characters in this String to lower case
        switch(browser)
        {
            case "firefox":
                System.out.println("your browser is : " + browser);
                // Further code to start the Firefox
                // Webdriver driver = new Firefox(); // Selenium Code
                break;

            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "edge":
                System.out.println("Execute the Edge Code");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;



        }

    }
}
