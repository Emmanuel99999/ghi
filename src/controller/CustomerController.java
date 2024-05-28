package controller;
import java.util.ArrayList;
import model.Customer;
import model.Employee;

public class CustomerController extends PersonController{

    ArrayList<Customer> listObjCustomers = new ArrayList<Customer>();

    @Override
    public boolean register(Employee objEmployee, Customer objCustomer){
        if(objCustomer != null){
            listObjCustomers.add(objCustomer);
            return true;
        } else{
            return false;
        }
    }
    @Override
    public String search(String name){
        String result = "";

        for (int i = 0; i < listObjCustomers.size(); i++) {
            if(listObjCustomers.get(i).getName().equals(name)){
                result = listObjCustomers.get(i).getId()+ " - "
                + listObjCustomers.get(i).getName() + " - "
                + listObjCustomers.get(i).getLastName()+ " - "
                +listObjCustomers.get(i).getAdvertise();
            }
        }
        return result;
    }
    @Override
    public boolean update(String name, Employee objEmployee, Customer objCustomer){
        boolean result =false;

        for(Customer objCustomer :listObjCustomers){
            if(objCustomer.getName().equals(name)){
                objCustomer.setId(objCustomer.getId());
                objCustomer.setName(objCustomer.getName());
                objCustomer.setLastName(objCustomer.getLastName());
                objCustomer.setAdvertise(objCustomer.getAdvertise());

                result = true;
            }
        }
        return result;
    }

    @Override
    public boolean remove(String name){
        boolean result = false;
        for (Customer objCustomer :listObjCustomers){
            if(objCustomer.getName().equals(name)){
                listObjCustomers.remove(objCustomer);
                result =true;
                break;
            }
        }
        return result;
    }
    @Override
    public String list() {
        String resultList ="";
        for (int i = 0; i < listObjCustomers.size(); i++) {
            resultList += listObjCustomers.get(i).getId()+ " - "
            +listObjCustomers.get(i).getName()+ " - "
            +listObjCustomers.get(i).getLastName()+ " - "
            +listObjCustomers.get(i).getAdvertise()
            +"\n";
        }
        return resultList;
    }

}
