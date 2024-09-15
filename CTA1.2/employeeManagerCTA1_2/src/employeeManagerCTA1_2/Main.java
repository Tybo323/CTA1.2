package employeeManagerCTA1_2;

public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("John", "Doe", 12345);
        emp.setSalary(50000);
        emp.employeeSummary();
        
        System.out.println(); // Just to add a line break between summaries

        // Create a Manager object
        Manager mgr = new Manager("Tyler", "Butorac", 32384, "Engineering");
        mgr.setSalary(75000);
        mgr.employeeSummary();
    }
}
