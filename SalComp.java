package lesson3;

import java.util.Comparator;

public class SalComp implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        return Double.compare(o1.salaryCalc(), o2.salaryCalc());
    }
}
