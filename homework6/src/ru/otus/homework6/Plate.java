package ru.otus.homework6;

public class Plate {

    private int maxCapaсity;
    private int currentCapacity;

    public Plate(int maxCapaсity, int currentCapacity) {
        this.maxCapaсity = maxCapaсity;
        this.currentCapacity = currentCapacity;
    }

    public void fill(int volume) {
        currentCapacity = Math.min(currentCapacity + volume, maxCapaсity);
    }

    public boolean consume(int volume) {
        if (currentCapacity >= volume) {
            currentCapacity -= volume;
            return true;
        }
        return false;
    }

}
