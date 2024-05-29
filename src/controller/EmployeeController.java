package controller;
import java.util.ArrayList;

import model.Customer;
import model.Employee;

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

        for(Employee individual : listObjEmployees){
            if(objEmployee.getName().equals(name)){
                individual.setJobId(individual.getJobId());
                individual.setId(individual.getId());
                individual.setName(individual.getName());
                individual.setLastName(individual.getLastName());
                individual.setDateOfBirth(individual.getDateOfBirth());
                individual.setGender(individual.getGender());
                individual.setEmailAddress(individual.getEmailAddress());
                individual.setPassword(individual.getPassword());
                individual.setWage(individual.getWage());
                individual.setTitle(individual.getTitle());
                individual.setStartingDate(individual.getStartingDate());


//(name, lastName, emailAddress, dateOfBirth, id, gender, password, jobId, wage, title, startingDate, accountStatus);
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