package src.ru.otus.homework5;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Васька", 5, 100);
        System.out.println("Время %.2f".formatted(cat1.run(50)));
        cat1.info();
        System.out.println("Время %.2f".formatted(cat1.run(120)));
        cat1.info();
        System.out.println("Время %.2f".formatted(cat1.swim(30)));
        cat1.info();
        System.out.println("________________________________");
        Dog dog1 = new Dog("Шарик", 6, 3,380);
        System.out.println("Время %.2f".formatted(dog1.run(50)));
        dog1.info();
        System.out.println("Время %.2f".formatted(dog1.run(120)));
        dog1.info();
        System.out.println("Время %.2f".formatted(dog1.swim(114)));
        dog1.info();
        System.out.println("________________________________");
        Horse horse1 = new Horse("Огонек", 12, 4,1000);
        System.out.println("Время %.2f".formatted(horse1.run(150)));
        horse1.info();
        System.out.println("Время %.2f".formatted(horse1.run(120)));
        horse1.info();
        System.out.println("Время %.2f".formatted(horse1.swim(150)));
        horse1.info();
    }

}
