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
}