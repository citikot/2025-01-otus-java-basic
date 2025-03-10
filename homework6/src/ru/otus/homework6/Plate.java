package ru.otus.homework6;

public class Plate {

    private int maxCapaсity;
    private int currentCapacity;

    public Plate(int maxCapaсity, int currentCapacity) {
        this.maxCapaсity = maxCapaсity;
        this.currentCapacity = currentCapacity;
    }

    public void fill(int volume) {
        currentCapacity += volume;
        if (currentCapacity > maxCapaсity) {
            currentCapacity = maxCapaсity;
        }
    }

    public boolean consume(int volume) {
        currentCapacity -= volume;
        if (currentCapacity < 0) {
            currentCapacity = 0;
            return false;
        }
        return true;
    }

}
