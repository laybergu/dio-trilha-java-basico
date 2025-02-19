package entities;

public class BankAccount {
    
    private int _id ; 
    private String _branch ; 
    private String _holder ; 
    private double _balance ;
    
    public BankAccount(int id, String branch, String holder, double balance) {
        this._id = id;
        this._branch = branch;
        this._holder = holder;
        this._balance = balance;
    }

    public int getId() {
        return _id;
    }

    public String getBranch() {
        return _branch;
    }

    public String getHolder() {
        return _holder;
    }

    public double getBalance() {
        return _balance;
    }

    private void setId(int id) {
        this._id = id ;
    }

    private void setBalance(double balance) {
        this._balance = balance ;
    }

    public void setHolder(String holder) {
        this._holder = holder;
    }

    public void Deposit(double amount) {
        double total = this._balance + amount; 
        setBalance(total);
    } 

    public void Withdrawal(double amount) {
        double total = this._balance - amount;
        setBalance(total);
    }
    
    public void ChangeId(int newId) {
        setId(newId);
    }

    public String creationMessage() {
        return 
            "Hello " + getHolder()
            + ", thank you for starting an account in our bank,"
            + " your branch is " + getBranch()
            + ", ID " + getId() 
            + " and your balance U$" + getBalance()
            + " is already available for withdrawal."
        ;
    }

}
