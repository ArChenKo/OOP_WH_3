package lesson3;

public class Worker extends Employee {

    public Worker(String lastName, String name, double salary, int experWork) {
        super(lastName, name, salary, experWork);
    }
    @Override
    public double salaryCalc() {
        return salary;
    }
    @Override
    public String toString() {
        return String.format("%s %s; Рабочий со стажем %d лет; Средняя зарплата (ставка): %.2f",
                lastName, name, experWork, salaryCalc());
    }
}