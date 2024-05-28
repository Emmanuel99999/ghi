//Authors
//Emmanuel Álvarez Franco
//Valeria Sucerquia Alvarez
package Main;
import model.Employee;
import model.Customer;
import controller.EmployeeController;
import controller.CustomerController;
import java.util.Scanner;
//import classes

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    private static CustomerController objCustomerController = new CustomerController();
    private static EmployeeController objEmployeeController = new EmployeeController();
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
        char answer;
        do{
            String jobId ="";
        do {
            System.out.println("Please add your job ID");
            jobId =scanner.nextLine();
        } while (jobId=="");
            String empty;
            System.out.println("Please type your government Id");
            String id = scanner.nextLine();

            System.out.println("Please type your name.");
            String name = scanner.nextLine();

            System.out.println("Please type your last name.");
            String lastName = scanner.nextLine();

            System.out.println("Please type your date of birth.");
            String dateOfBirth= scanner.nextLine();

            System.out.println("Please type your gender, M: male, F: female, O: other");
            char gender = scanner.next().toUpperCase().charAt(0);
            empty = scanner.nextLine();

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
            
            boolean accountStatus =true;

            //System.out.println(name+lastName+dateOfBirth+gender+emailAddress+password+wage+title+startingDate);

            //TODO crear objeto cuenta

            Employee objEmployee = new Employee(name, lastName, emailAddress, dateOfBirth, id, gender, password, jobId, wage, title, startingDate, accountStatus);
            if(objEmployeeController.register(objEmployee, null)){
                System.out.println("\n Employee has been successfully created!");
            } else {
                System.out.println("\n Employee not created, please try again");
            }
            System.out.println("Would you like to add another employee? Y for employee, C for customer, N to end.");
            answer= scanner.next().toUpperCase().charAt(0);
            if(answer=='C'){
                registerCustomer();
            }
        } while (answer=='Y');

    }
    private static void searchEmployee(){
        System.out.println("Please type the Employee's name to search");
        String name = scanner.nextLine();
        String result =objEmployeeController.search(name);
        if (result != "") {
            System.out.println("\n"+result);
        } else{
            System.out.println("\n Employee not found...");
        }

    }
    private static void updateEmployee(){
        System.out.println("type the Employees name to update");
        String searchEmployee =scanner.nextLine();

        String result = objCustomerController.search(searchEmployee);
        if (result!= "") {
            System.out.println(result);
            String jobId ="";
            do {
                System.out.println("Type the employee's job Id");
                jobId=scanner.nextLine();
            } while (jobId=="");
            String empty;
            System.out.println("Please type your government Id");
            String id = scanner.nextLine();

            System.out.println("Please type your name.");
            String name = scanner.nextLine();

            System.out.println("Please type your last name.");
            String lastName = scanner.nextLine();

            System.out.println("Please type your date of birth.");
            String dateOfBirth= scanner.nextLine();

            System.out.println("Please type your gender, M: male, F: female, O: other");
            char gender = scanner.next().toUpperCase().charAt(0);
            empty = scanner.nextLine();

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
        }
    }
    private static void removeEmployee(){
        System.out.println(" Please type the employee to delete.");
        String name =scanner.nextLine();

        boolean result = objEmployeeController.remove(name);

        if (result) {
            System.out.println("The employee has been successfully deleted");
        } else {
            System.out.println("The employee was not found, try again!");
        }
    }
    private static void listEmployee(){
        System.out.println("Employee's list.");
        String resultList = objEmployeeController.list();

        if (resultList!= "") {
        System.out.println(resultList);
        } else{
            System.out.println("The Employee's list is empty.");
        }
    }
    //customer functions
    private static void registerCustomer(){
        char answer;
        String id = "";
        final Scanner scanner = new Scanner(System.in);
        do {
        System.out.println("Please type your government Id");
        id = scanner.nextLine();
    } while (id=="");{

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

        System.out.println("Would you like to subscribe to our advertisements? Y for yes, N for no");
        char advertise = scanner.next().toUpperCase().charAt(0);

        System.out.println("would you like to subscribe to our newsletter?");
        char news = scanner.next().toUpperCase().charAt(0);

        System.out.println("Would you like to subscribe to our discounts?");
        char discounts = scanner.next().toUpperCase().charAt(0);

        System.out.println("would you like to subscribe to our promotion campaigns?");
        char promos = scanner.next().toUpperCase().charAt(0);

        System.out.println("would you like to participate on our referral program?");
        char referralProgram = scanner.next().toUpperCase().charAt(0);

       // System.out.println(name+lastName+dateOfBirth+gender+emailAddress+advertise+news+discounts+promos+referralProgram);
        Customer objCustomer =new Customer(name, lastName, emailAddress, dateOfBirth, id, gender, advertise, news, discounts, promos, referralProgram );
        if(objCustomerController.register(null, objCustomer)){
            System.out.println("\n Customer has been successfully created!");
        } else {
            System.out.println("\n Customer not created, please try again");
        }
        System.out.println("Would you like to add another Customer? Y for Customer, E for Employee, N to end");
        answer= scanner.next().toUpperCase().charAt(0);
        if(answer=='E'){
            registerEmployee();
        }
    } while (answer=='Y');
    }
    private static void searchCustomer(){
        System.out.println("Please type the Customer's name to search");
        String name = scanner.nextLine();
        String result =objCustomerController.search(name);
        if (result != "") {
            System.out.println("\n"+result);
        } else{
            System.out.println("\n Customer not found...");
        }
    }
    private static void updateCustomer(){

    }
    private static void removeCustomer(){
        System.out.println("please type the name of the customer to delete");
        String name = scanner.nextLine();
        boolean result =objCustomerController.remove(name);
        if (result) {
            System.out.println("The customer has been successfully deleted.");
        } else {
            System.out.println("The customer has not been found, try again.");
        }
    }
    private static void listCustomer(){
        System.out.println("Customer's list.");
        String resultList = objCustomerController.list();

        if (resultList!= "") {
        System.out.println(resultList);
        } else{
            System.out.println("The Customer's list is empty.");
        }
    }
}
