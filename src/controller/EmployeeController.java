package controller;
import java.util.ArrayList;
import model.employee;

public class EmployeeController extends PersonController {
    @Override
    boolean register(Customer objCustomer, Employee objEmployee){
        if(objEmployee != null){
            listObjEmployee.add(objEmployee);
            return true;
        } else{
            return false;
        }
    }
    @Override
    public String search(String name){
        String result = "";

        for (int i = 0; i < listObjEmployee.size(); i++) {
            if(listObjEmployee.get(i).getName().equals(name)){
                result = listObjEmployee.get(i).getJobId()+ " - "
                + listObjEmployee.get(i).getName() + " - "
                + listObjEmployee.get(i).getLastName()+ " - "
                +listObjEmployee.get(i).getTitle();
            }
        }
    }
    @Override
    public boolean update(String name, Employee objEmployee, Customer objCustomer){
        boolean result =false;

        for(Employee objEmployee :listObjEmployee){
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
    
        for (Employee objEmployee :listObjEmployee){
            if(objEmployee.getName().equals(name)){
                listObjEmployee.remove(objEmployee);
                result =true;
                break;
            }
        }
    }
    @Override
    public String list() {
        string resultList ="";
        for (int i = 0; i < listObjEmployee.size(); i++) {
            resultList += listObjEmployee.get(i).getJobId()+ " - "
            +listObjEmployee.get(i).getName()+ " - "
            +listObjEmployee.get(i).getLastName()+ " - "
            +listObjEmployee.get(i).getTitle()
            +"\n";
        }
        return resultList;
    }
}