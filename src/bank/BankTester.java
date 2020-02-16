package bank;

public class BankTester {

    public static void main(String[] args) throws TransferException {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();

        b1.deposit(100);

        System.out.printf("\nTest 1: No exceptions.\n");
        BankAccount.transfer(b1, b2, 25);

        System.out.printf("\nTest 2: Exception thrown by withdraw.\n");
        try  {
            b1.withdraw(200);
        }
        catch (Exception e) {
            System.out.printf("Withdraw threw an exception. Exception is of class '%s' with message '%s'\n", e.getClass(), e.getMessage());
        }

        System.out.printf("\nTest 3: Transfer handles exception propagation from withdraw.\n");
        try {
            BankAccount.transfer(b1, b2, 200);
        }
        catch (Exception e) {
            System.out.printf("Transfer threw an exception. Exception is of class '%s' with message '%s'\n", e.getClass(), e.getMessage());
        }

        System.out.printf("\nTest 4: Main does not handle an exception propagated by Transfer.\n");
        BankAccount.transfer(null, b1, 200);
    }


}
