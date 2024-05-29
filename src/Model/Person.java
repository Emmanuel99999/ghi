package model;

abstract class Person{

protected String name= "Blank";
protected String lastName;
protected String emailAddress;
protected String dateOfBirth;
protected String id;
protected char gender;

public void setGender(char gender) {
    this.gender = gender;
}

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
public String getDateOfBirth(){
    return dateOfBirth;
}
public String getId(){
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
public void setDateOfBirth(String dateOfBirth){
    this.dateOfBirth = dateOfBirth;
}
public void setId(String id){
    this.id = id;
}
public void setChar(char gender){
    this.gender = gender;
}
public Person(String name, String lastName, String emailAddress, String dateOfBirth, String id, char gender){
    this.name = name;
    this.lastName = lastName;
    this.emailAddress = emailAddress;
    this.dateOfBirth = dateOfBirth;
    this.id = id;
    this.gender = gender;
}
}
