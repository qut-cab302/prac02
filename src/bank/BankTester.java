package bank;

public class BankTester {

    public static void main(String[] args) throws TransferException, FundsException {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();

        b1.deposit(100);

        BankAccount.transfer(b1, b2, 25);
        System.out.printf("Transferred from b1 to b2; b1 has %d and b2 has %d in funds.", b1.getFunds(), b2.getFunds());

        try  {
            b1.withdraw(200);
        }
        catch (Exception e) {
            System.out.printf("%s %s\n", e.getClass(), e.getMessage());
        }

        try {
            BankAccount.transfer(b1, b2, 200);
        }
        catch (Exception e) {
            System.out.printf("b1 to b2 transfer failed. b1 has %d and b2 has %d in funds.", b1.getFunds(), b2.getFunds());
        }

        b1.withdraw(200);

    }


}
