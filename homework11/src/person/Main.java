package src.person;

public class Main {

    static PersonDataBase persons = new PersonDataBase();

    public static void main(String[] args) {

        Person person1 = new Person("Ivan", Position.BRANCH_DIRECTOR);
        persons.add(person1);
        Person person2 = new Person("Peter", Position.JUNIOR_DEVELOPER);
        persons.add(person2);

        System.out.println(persons.isManager(person1));
        System.out.println(persons.isEmployee(person1));
        System.out.println(persons.isManager(person2));
        System.out.println(persons.isEmployee(person2));
        System.out.println(persons.findById((long) 0));
        System.out.println(persons.findById((long) 1));
        System.out.println(persons.findById((long) 2));
        System.out.println(persons.findById((long) 3));
    }
}
