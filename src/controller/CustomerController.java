public class CustomerController {
    @Override
    boolean register(Customer objCustomer, Employee objEmployee){
        if(objCustomer != null){
            listObjCustomer.add(objCustomer);
            return true;
        } else{
            return false;
        }
    }
    @Override
    public String search(String name){
        String result = "";

        for (int i = 0; i < listObjCustomer.size(); i++) {
            if(listObjCustomer.get(i).getName().equals(name)){
                result = listObjCustomer.get(i).getJobId()+ " - "
                + listObjCustomer.get(i).getName() + " - "
                + listObjCustomer.get(i).getLastName()+ " - "
                +listObjCustomer.get(i).getTitle();
            }
        }
    }
    @Override
    public boolean update(String name, Employee objEmployee, Customer objCustomer){
        boolean result =false;

        for(Customer objCustomer :listObjCustomer){
            if(objCustomer.getName().equals(name)){
                objCustomer.setJobId(objCustomer.getJobId());
                objCustomer.setName(objCustomer.getName());
                objCustomer.setLastName(objCustomer.getLastName());
                objCustomer.setTitle(objCustomer.getTitle());

                result = true;
            }
        }
        return result;
    }

    @Override
    public boolean remove(String name){
        boolean result = false;
        for (Customer objCustomer :listObjCustomer){
            if(objCustomer.getName().equals(name)){
                listObjCustomer.remove(objCustomer);
                result =true;
                break;
            }
        }
    }
    @Override
    public String list() {
        string resultList ="";
        for (int i = 0; i < listObjCustomer.size(); i++) {
            resultList += listObjCustomer.get(i).getJobId()+ " - "
            +listObjCustomer.get(i).getName()+ " - "
            +listObjCustomer.get(i).getLastName()+ " - "
            +listObjCustomer.get(i).getTitle()
            +"\n";
        }
        return resultList;
    }
}
