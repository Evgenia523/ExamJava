import java.util.Objects;

public class Employee {

    private final int id;

    private String name;

    private String surname;

    private String middleName;

    private int department;

    private double salary;

    private static int counter;

    public Employee(String name, String surname, String middleName, int department, double salary) {
        if (department > 5 || department < 1){
            throw new IllegalArgumentException("Введено невалидное значение");
        }
        this.department = department;
        counter++;
        this.id = getCounter();
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public String getMiddleName() {
        return middleName;
    }


    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        if (department > 5 || department < 1){
            throw new IllegalArgumentException("Введено невалидное значение");
        }
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getCounter() {
        return counter;
    }

    public String getFullName() {
        return "Фамилия: " + getSurname() + " Имя: " + getName() + " Отчество: " + getMiddleName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && department == employee.department && Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(middleName, employee.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, middleName, department, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middleName='" + middleName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}
