public class EncapsulationExample {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public int getEmployeeId() {
        return employee_id;
    }

    public void setEmployeeId(int employeeId) {
        this.employee_id = employeeId;
    }

    public String getEmployeeName() {
        return employee_name;
    }

    public void setEmployeeName(String employeeName) {
        this.employee_name = employeeName;
    }

    public double getEmployeeSalary() {
        return employee_salary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employee_salary = employeeSalary;
    }

    public String getFormattedSalary() {
        return String.format("$%.2f", employee_salary);
    }

    public static void main(String[] args) {
        EncapsulationExample employee = new EncapsulationExample();

        employee.setEmployeeId(15);
        employee.setEmployeeName("Caelius Dathan");
        employee.setEmployeeSalary(4900.0);

        int employeeId = employee.getEmployeeId();
        String employeeName = employee.getEmployeeName();
        String formattedSalary = employee.getFormattedSalary();

        System.out.println("Employee Details:");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + formattedSalary);
    }
}