public class Client extends User {
    private static int idCounter = 1;
    private final int clientId;
    private Account account;

    public Client(String firstName, String lastName, Account account) {
        super(firstName, lastName);
        this.clientId = idCounter++;
        this.account = account;
    }

    public int getClientId() {
        return clientId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void performTransaction(Transaction transaction) {
        // Implementation for performing transactions
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", account=" + account +
                '}';
    }
}
