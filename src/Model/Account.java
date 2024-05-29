package model;


public class Account {

    private String emailAddress;
    private String password;
    private boolean accountStatus;

    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isAccountStatus() {
        return accountStatus;
    }
    public void setAccountStatus(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Account(String emailAddress, String password, boolean accountStatus){
        this.emailAddress= emailAddress;
        this.password= password;
        this.accountStatus= accountStatus;

    }

}
