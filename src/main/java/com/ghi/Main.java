package com.ghi;
import java.util.Date;

import com.ghi.Main.Person;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
abstract class Person{

protected String name= "Blank";
protected String lastName;
protected String emailAddress;
protected Date dateOfBirth;
protected int id;
protected char gender;

//getters
public String getName() {
    return name;
}

public String getLastName() {
    return lastName;
}

public String getEmailAddress() {
    return emailAddress;
}
public Date getDateOfBirth(){
    return dateOfBirth;
}
public int getId(){
    return id;
}
public char getGender(){
    return gender;
}
//setters
public void setName(String name) {
    this.name = name;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}
public void setEmailAddress(String emailAddress){
    this.emailAddress = emailAddress;
}
public void setDateOfBirth(Date dateOfBirth){
    this.dateOfBirth = dateOfBirth;
}
public void setId(int id){
    this.id = id;
}
public void setChar(char gender){
    this.gender = gender;
}

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