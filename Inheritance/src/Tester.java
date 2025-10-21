public class Tester {

    public static void main(String[] args){

        BankCustomer bankCustomer = new BankCustomer("123", "David", "Baltimore", 1000);
        System.out.println(bankCustomer.display());
        bankCustomer.deposit("123", 500);
        System.out.println("new balance: " + bankCustomer.balance);

    }

}
