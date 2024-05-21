package com.ghi;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
public class Person{

private String name= "Blank";
private String lastName;
private String emailAdress;
private Date dateOfBirth;
private int id;
private char gender;

}
class Customer extends Person {
    protected boolean advertise;
    protected boolean news;
    protected boolean discounts;
    protected boolean promos;
    protected boolean referralProgram;

}
class Employee extends Person{
    protected String password;
    protected int jobId;
    protected float wage;
    protected String title;
    protected Date startingDate;
    protected boolean accountStatus;
}
}