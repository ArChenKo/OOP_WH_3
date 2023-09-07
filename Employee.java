package lesson3;
/**
 * Сотрудник
 */
public abstract class Employee implements Comparable<Employee> {


    /**
     * Фамилия
     */
    protected String lastName;

    /**
     * Имя
     */
    protected String name;

    /**
     * Заработная плата
     */
    protected double salary;

    /**
     * Стаж работы
     */
    protected int experWork;

    public abstract double salaryCalc();

    public Employee(String lastName, String name, double salary, int experWork) {
        this.lastName = lastName;
        this.name = name;
        this.salary = salary;
        this.experWork = experWork;
    }

    @Override
    public String toString() {
        return String.format("%s %s", lastName, name);
    }

    @Override
    public int compareTo(Employee o) {
        int res = Integer.compare(experWork,o.experWork);
        if(res == 0) {
            return Double.compare(salaryCalc(),o.salaryCalc());
        }
        return res;
    }
}
