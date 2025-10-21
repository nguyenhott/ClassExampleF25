public class Tester {

    public static void main(String[] args){

        ATM atm1 = new ATMBankAmerica("123", "abc", 1000);
        atm1.verifyPIN("123");
        atm1.withdraw("abc", 500);

        ATMBankAmerica atm2 = new ATMBankAmerica("234", "cbd", 500);
    }
}
