package controller;
import java.util.ArrayList;

import model.Customer;
import model.Employee;
import model.employee;

public class EmployeeController extends PersonController {

    ArrayList<Employee> listObjEmployees = new ArrayList<Employee>();

    @Override
    public boolean register(Employee objEmployee, Customer objCustomer){
        if(objEmployee != null){
            listObjEmployees.add(objEmployee);
            return true;
        } else{
            return false;
        }
    }
    @Override
    public String search(String name){
        String result = "";

        for (int i = 0; i < listObjEmployees.size(); i++) {
            if(listObjEmployees.get(i).getName().equals(name)){
                result = listObjEmployees.get(i).getJobId()+ " - "
                + listObjEmployees.get(i).getName() + " - "
                + listObjEmployees.get(i).getLastName()+ " - "
                +listObjEmployees.get(i).getTitle();
            }
        }
        return result;
    }
    @Override
    public boolean update(String name, Employee objEmployee, Customer objCustomer){
        boolean result =false;

        for(Employee objEmployee :listObjEmployees){
            if(objEmployee.getName().equals(name)){
                objEmployee.setJobId(objEmployee.getJobId());
                objEmployee.setName(objEmployee.getName());
                objEmployee.setLastName(objEmployee.getLastName());
                objEmployee.setTitle(objEmployee.getTitle());

                result = true;
            }
        }
        return result;
    }

    @Override
    public boolean remove(String name){
        boolean result = false;
    
        for (Employee objEmployee :listObjEmployees){
            if(objEmployee.getName().equals(name)){
                listObjEmployees.remove(objEmployee);
                result =true;
                break;
            }
        }
        return result;
    }
    @Override
    public String list() {
        String resultList ="";
        for (int i = 0; i < listObjEmployees.size(); i++) {
            resultList += listObjEmployees.get(i).getJobId()+ " - "
            +listObjEmployees.get(i).getName()+ " - "
            +listObjEmployees.get(i).getLastName()+ " - "
            +listObjEmployees.get(i).getTitle()
            +"\n";
        }
        return resultList;
    }
}