public class Employee extends User {
    private static int idCounter = 1;
    private final int employeeId;

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
        this.employeeId = idCounter++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Client addClient(String firstName, String lastName, Account account) {
        return new Client(firstName, lastName, account);
    }

    public Account openAccount() {
        return new Account();
    }

    public void acceptDeposit(Account account, double amount) {
        account.deposit(amount);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }
}
