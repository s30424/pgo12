import java.util.ArrayList;
import java.util.List;

public class Admin extends Employee {
    private List<Employee> employees = new ArrayList<>();

    public Admin(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "employeeId=" + getEmployeeId() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", employees=" + employees +
                '}';
    }
}
