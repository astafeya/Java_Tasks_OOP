package singleclasses;

public class Employee {
    int id;
    String firstName;
    String lastName;
    int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        int newSalary = (int)(salary * (1 + percent / 100));
        this.salary = newSalary;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[id = " + id + ", name = " + firstName + " " + lastName + ", salary = " + salary + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) obj;
        return id == employee.id && firstName.equals(employee.firstName) && lastName.equals(employee.lastName) &&
                salary == employee.salary;
    }

    @Override
    public int hashCode() {
        int code = 17;
        code = 31 * code + id;
        code = 31 * code + salary;
        code = 31 * code + firstName.hashCode();
        code = 31 * code + lastName.hashCode();
        return code;
    }
}
