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
        String jobId;
        do {
            System.out.println("Please add your job ID");
            jobId =scanner.nextLine();
            
        } while (jobId=='');

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
