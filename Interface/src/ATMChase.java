public class ATMChase implements ATM {

    String pin;
    String account;
    double balance;

    public ATMChase(String pin, String account, double amount){
        this.pin = pin;
        this.account = account;
        this.balance = amount;
    }

    public boolean verifyPIN(String pin){
        if(this.pin.equals(pin) && !pin.isEmpty())
            //allow the user to log in to the system
            return true;

        return false;
    }

    public boolean withdraw(String account, double amount){
        if(this.account.equals(account) && this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
}
