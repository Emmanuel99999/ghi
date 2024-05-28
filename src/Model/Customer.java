package com.ghi;
import model.Person;
class Customer extends Person {
    private char advertise;
    private char news;
    private char discounts;
    private char promos;
    private char referralProgram;
    public char getAdvertise() {
        return advertise;
    }
    public void setAdvertise(char advertise) {
        this.advertise = advertise;
    }
    public char getNews() {
        return news;
    }
    public void setNews(char news) {
        this.news = news;
    }
    public char getDiscounts() {
        return discounts;
    }
    public void setDiscounts(char discounts) {
        this.discounts = discounts;
    }
    public char getPromos() {
        return promos;
    }
    public void setPromos(char promos) {
        this.promos = promos;
    }
    public char getReferralProgram() {
        return referralProgram;
    }
    public void setReferralProgram(char referralProgram) {
        this.referralProgram = referralProgram;
    }

    public Customer(String name, String lastName, String emailAddress, String dateOfBirth, String id, char gender)
    {
        super(name,lastName,emailAddress,dateOfBirth,id,gender);
        this.advertise =advertise;
        this.discounts = discounts;
        this.news = news;
        this.promos = promos;
        this.referralProgram= referralProgram;
    }
}
