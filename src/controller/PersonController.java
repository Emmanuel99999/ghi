package controller;
import model.Customer;
import model.Employee;
abstract class PersonController {
    abstract boolean register(Employee objEmployee, Customer objCustomer);
    abstract String search(String name);
    abstract boolean update(String name, Employee objEmployee, Customer objCustomer);
    abstract boolean remove(String name);
    abstract String list();
}
