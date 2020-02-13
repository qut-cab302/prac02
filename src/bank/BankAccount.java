package bank;

public class BankAccount {

    private int funds;

    /**
     * Deposits an amount into this bank account.
     *
     * @param amount
     */
    public void deposit(int amount) {
        this.funds += amount;
    }

    /**
     * Getter method for funds.
     *
     * @return current funds.
     */
    public int getFunds() {
        return this.funds;
    }

    /**
     * Withdraws an amount from this bank account.
     *
     * @param amount
     * @throws FundsException if there are insufficient funds for the withdraw.
     */
    public void withdraw(int amount) throws FundsException {
        if (this.funds < amount) {
            throw new FundsException(String.format("Withdraw failed. This account has %d in funds but %d were requested.", this.funds, amount));
        }
        this.funds -= amount;
    }

    /**
     * Transfers an amount from one bank account to another.
     *
     * @param b1 The bank account the funds are transferred from.
     * @param b2 The bank account the funds are transferred to.
     * @param amount The amount to be transferred.
     * @throws TransferException if the withdraw fails.
     */
    public static void transfer(BankAccount b1, BankAccount b2, int amount) throws TransferException {
        try {
            b1.withdraw(amount);
            b2.deposit(amount);
        } catch (FundsException e) {
            throw new TransferException(String.format("Transfer failed due to exception: %s", e.getMessage()));
        } finally {
            System.out.println("");
        }

    }


}


