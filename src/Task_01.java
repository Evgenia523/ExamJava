import java.util.Arrays;

public class Task_01 {
    private static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Иван", "Петров", "Сергеевич",5,50000);
        employees[1] = new Employee("Андрей", "Иванов", "Петрович",1,55000);
        employees[2] = new Employee("Артемий", "Андреев", "Иванович",2,52000);
        employees[3] = new Employee("Тимофей", "Артемьев", "Андреевич",4,50000);
        employees[4] = new Employee("Сергей", "Тимофеев", "Артемьевич",5,52000);
        employees[5] = new Employee("Василий", "Сергеев", "Тимофеевич",5,57000);
        employees[6] = new Employee("Александр", "Васильев", "Сергеевич",5,61000);
        employees[7] = new Employee("Елена", "Александрова", "Васильевна",1,75000);
        employees[8] = new Employee("Татьяна", "Петрова", "Александровна",5,101000);
        employees[9] = new Employee("Людмила", "Титова", "Ивановна",2,35000);
        getAllEmployee();
        System.out.println("сумму затрат на зарплаты в месяц: " + getSumSalary());
        System.out.println("сотрудник с минимальной зарплатой: " + getMinSalary());
        System.out.println("сотрудник с максимальной зарплатой: " + getMaxSalary());
        System.out.println("среднее значение зарплат: " + getSumSalary()/ employees.length);
        getFullName();

    }
    public static void getAllEmployee() {
        if (employees != null) {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }
    public static double getSumSalary () {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee == null) continue;
            sum += employee.getSalary();
        }
        return sum;
    }
    public static Employee getMinSalary() {
        double min = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                min = employees[i].getSalary();
                index = i;
                break;
            }
        }
        Employee minSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                minSalary = employees[i];
            }
        }
        return minSalary;
    }
    public static Employee getMaxSalary() {
        double max = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                max = employees[i].getSalary();
                index = i;
                break;
            }
        }
        Employee maxSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                maxSalary = employees[i];
            }
        }
        return maxSalary;
    }
    public static void getFullName() {
        for (Employee employee: employees) {
            System.out.println(employee.getFullName());
        }
    }
}
