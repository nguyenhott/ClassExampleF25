public class ATMBankAmerica implements ATM {

    String pin;
    String account;
    double balance;

    public ATMBankAmerica(String pin, String account, double amount){
        this.pin = pin;
        this.account = account;
        this.balance = amount;
    }

    public boolean verifyPIN(String pin){
        if(this.pin.equals(pin))
            //allow the user to log in to the system
            return true;

        return false;
    }

    public boolean withdraw(String account, double amount){
        if(this.account.equals(account)) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
}
