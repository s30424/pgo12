public class Transaction {
    private double amount;
    private String fromAccount;
    private String toAccount;

    public Transaction(double amount, String fromAccount, String toAccount) {
        this.amount = amount;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", fromAccount='" + fromAccount + '\'' +
                ", toAccount='" + toAccount + '\'' +
                '}';
    }
}
