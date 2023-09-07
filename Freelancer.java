package lesson3;

/**
 * Фрилансер (работник с почасовой оплатой)
 */
public class Freelancer extends Employee {
    public Freelancer(String lastName, String name, double salary, int experWork) {
        super(lastName, name, salary, experWork);
    }
    @Override
    public double salaryCalc() {
        return salary * 0.8;
    }
    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер со стажем %d лет; Средняя зарплата (ставка): %.2f",
                lastName, name, experWork, salaryCalc());
    }
}
