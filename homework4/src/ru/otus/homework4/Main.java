package ru.otus.homework4;

public class Main {

    public static void main(String[] args) {

        Box box = new Box(10, 20, 5, "gray");
        box.printDescription();
        box.close();
        box.printDescription();
        box.paintTo("red");
        box.printDescription();
        box.putPayload("подарок");
        box.open();
        box.putPayload("подарок");
        box.putPayload("подарок");
        box.close();
        box.putPayload("подарок");
        box.dropPayload();
        box.open();
        box.putPayload("подарок");
        box.dropPayload();
        box.printDescription();
        System.out.println("-------------------------------------");

        User[] users = {
                new User("Ivan", "Petrov", "Ivanovich", 1972, "ii@aa.com"),
                new User("Alexey", "Sidorov", "Nikolaevich", 1985, "alexey.sidorov@mail.com"),
                new User("Maria", "Ivanova", "Sergeevna", 1990, "m.ivanova@gmail.com"),
                new User("Sergey", "Kuznetsov", "Viktorovich", 1978, "sergey.kuznetsov@yandex.ru"),
                new User("Elena", "Smirnova", "Alexandrovna", 1982, "elena.smirnova@outlook.com"),
                new User("Dmitry", "Fedorov", "Igorevich", 1995, "dmitry.fedorov@hotmail.com"),
                new User("Olga", "Vorobieva", "Pavlovna", 1988, "olga.vorobieva@ya.ru"),
                new User("Anton", "Lebedev", "Romanovich", 2000, "anton.lebedev@live.com"),
                new User("Natalia", "Solovyova", "Evgenievna", 1976, "natalia.solovyova@mail.ru"),
                new User("Vladimir", "Morozov", "Artemovich", 1969, "v.morozov@inbox.ru")
        };

        for (User user : users) {
            if (user.calculateAge() > 40) {
                user.printData();
            }
        }
    }
}
