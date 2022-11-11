package bancooo;

public class Account {

    private String id;
    private String user;
    private double balance;
    private String password;
    private String username;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    public Account(String id, String user, double balance, String password, String username) {
        this.id = id;
        this.user = user;
        this.balance = balance;
        this.password = password;
        this.username = username;
    }
    public boolean checkpassword (String password){
        return password.equals(getPassword());
        
    } 

    public void withdraw(double amount) {
        if(checkpassword(password)){
            if (amount > balance || amount <= 0) {
            System.out.println("no c puede");
        } else {
            setBalance(balance-amount);

        }
            
        }
        else{
            System.out.println("no c puede");
        }
    }
    public void deposit(double amount){
        if(amount<=0){
            System.out.println("no c pude, no hay tortillas");
        }
        else{
            setBalance(balance+amount);
        }
    }

}
