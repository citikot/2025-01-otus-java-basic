package ru.otus.homework6;

public class Cat {

    private String name;
    private int appetite;
    private boolean isFed;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFed = false;
    }

    public void setFed(boolean fed) {
        this.isFed = fed;
    }

    public String getName() {
        return name;
    }

    public boolean isFed() {
        return isFed;
    }
}
