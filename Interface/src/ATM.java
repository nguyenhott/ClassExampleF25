public interface ATM {

    abstract boolean verifyPIN(String pin);
    abstract boolean withdraw(String account, double amount);

}
