public class BankCustomer extends Customer {

    double balance;

    public BankCustomer(String id, String name, String address, double balance){
        super(id, name, address);
        this.balance = balance;
    }

    boolean deposit(String id, double amount){
        if(checkId(id))
            if(amount > 0)
            {
                this.balance += amount;
                return true;
            }
        return false;
    }

    boolean withdraw(String id, double amount){
        if(checkId(id)){
            if(this.balance >= amount){
                this.balance -= amount;
                return true;
            }
        }
        return false;
    }
}
