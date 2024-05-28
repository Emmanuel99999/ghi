//Authors
//Emmanuel Álvarez Franco
//Valeria Sucerquia Alvarez
package com.ghi;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        char inputRole;
        System.out.println("Welcome to the characterization program by G.H.I.");

        System.out.println("What role do you want to add?, please type E for employee, C for customer");
        inputRole = scanner.next().toUpperCase().charAt(0);

        if(inputRole=='E'){

            //TODO hacer while para menu
            registerEmployee();
            searchEmployee();
            updateEmployee();
            removeEmployee();
            listEmployee();
        }
        else if(inputRole=='C'){
            //TODO hacer while para menu
            registerCustomer();
            searchCustomer();
            updateCustomer();
            removeCustomer();
            listCustomer();
        }
        else{
            System.out.println("Please type a valid option");
        }

    }
//employee functions
    private static void registerEmployee(){
        final Scanner scanner = new Scanner(System.in);
        String jobId="";
        do {
            System.out.println("Please add your job ID");
            jobId =scanner.nextLine();
            
        } while (jobId=="");{
            System.out.println("Please type your name.");
            String name = scanner.nextLine();
            System.out.println("Please type your last name.");
            String lastName = scanner.nextLine();
            System.out.println("Please type your date of birth.");
            String dateOfBirth= scanner.nextLine();
            System.out.println("Please type your gender, M: male, F: female, O: other");
            char gender = scanner.next().toUpperCase().charAt(0);
            String empty = scanner.nextLine();
            System.out.println("Please type your email address.");
            String emailAddress = scanner.nextLine();
            System.out.println("Please enter your new password.");
            String password = scanner.nextLine();
            System.out.println("Please enter your monthly wage.");
            float wage = scanner.nextFloat();
            empty = scanner.nextLine();
            System.out.println("Please enter your current job position.");
            String title = scanner.nextLine();
            System.out.println("Please enter your sign in day.");
            String startingDate= scanner.nextLine();
            //System.out.println(name+lastName+dateOfBirth+gender+emailAddress+password+wage+title+startingDate);
        }
        

    }
    private static void searchEmployee(){

    }
    private static void updateEmployee(){

    }
    private static void removeEmployee(){

    }
    private static void listEmployee(){

    }
    //customer functions
    private static void registerCustomer(){

    }
    private static void searchCustomer(){

    }
    private static void updateCustomer(){

    }
    private static void removeCustomer(){

    }
    private static void listCustomer(){
        
    }
}
