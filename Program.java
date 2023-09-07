package lesson3;

import java.util.Arrays;
import java.util.Random;

public class Program {

    private static Random random = new Random();

    public static Employee generateEmployee(){
        String[] names = new String[] { "Александр", "Вениамин", "Мария", "Августина", "Ель" };
        String[] lastnames = new String[] { "Седых", "Просека", "Музыка", "Непейвода", "Воля" };

        int salaryIndex = random.nextInt(400, 1000);
        int experienceWorkIndex = random.nextInt(1,15);
        int draw = random.nextInt(0,2);

        if (draw == 0){
            return
                    new Freelancer(lastnames[random.nextInt(lastnames.length)], names[random.nextInt(names.length)], salaryIndex*100,experienceWorkIndex);
        } else {
            return
                    new Worker(lastnames[random.nextInt(lastnames.length)], names[random.nextInt(names.length)], salaryIndex * 100,experienceWorkIndex);
        }
    }

    public static Employee[] generateEmployees(int counter){
        Employee[] workers = new Employee[counter];
        for (int i = 0; i < workers.length; i++){
            workers[i] = generateEmployee();
        }
        return workers;
    }

    public static void main(String[] args) {

        Employee[] workers = generateEmployees(7);

        for (Employee worker: workers) {
            System.out.println(worker);
        }


        Arrays.sort(workers);

        System.out.println();

        for (Employee worker: workers) {
            System.out.println(worker);
        }
    }
}
