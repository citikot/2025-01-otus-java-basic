package ru.otus.homework4;

import java.time.LocalDate;

public class User {
    private String name;
    private String surname;
    private String patronymic;
    private int year;
    private String email;

    public User(String name, String surname,
                String patronymic, int year,
                String email) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.year = year;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", year=" + year +
                ", email='" + email + '\'' +
                '}';
    }

    public void printData() {
        System.out.println(String.format("ФИО: %s %s %s", surname, name, patronymic));
        System.out.println(String.format("Год рождения: %d", year));
        System.out.println(String.format("е-мейл: %s", email));
    }

    public int calculateAge() {
        return LocalDate.now().getYear() - year;
    }
}
