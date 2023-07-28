package Question4;

public class Main {
    public static void main(String[] args) {
        //instance of the class Peron
        Person person1 = new Person(12, 2000000);
        //Getting the age and salary
        System.out.println("Getting age and salary");
        System.out.println("Age: " + person1.getAge());
        System.out.println("Salary: " + person1.getSalary());

        //Setting the age and salary
        person1.setAge(15);
        person1.setSalary(2500000);
        System.out.println("\nUpdated age and salary");
        System.out.println("Age: " + person1.getAge());
        System.out.println("Salary: " + person1.getSalary());


    }
}
