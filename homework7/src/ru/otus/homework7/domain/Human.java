package ru.otus.homework7.domain;

public class Human {

    private String name;
    private Transport currentTransport;
    private final int STAMINA = 30;
    private final double STAMINA_CONSUMPTION_PER_KM = 3;
    private int currentStamina = STAMINA;

    public Human(String name, Transport currentTransport) {
        this.name = name;
        this.currentTransport = currentTransport;
    }

    public Human(String name) {
        this.name = name;
        this.currentTransport = null;
    }

    public String getName() {
        return name;
    }

    public Transport getCurrentTransport() {
        return currentTransport;
    }

    public void setCurrentTransport(Transport transport) {
        this.currentTransport = transport;
    }

    public boolean move(double distance, Terrain terrain) {

        if (currentTransport == null) {

            if (getConsumption(distance) > currentStamina) {
                System.out.println("{} столько не пройдет пешком. Нету больше сил.".formatted(name));
                return false;
            }
            currentStamina -= getConsumption(distance);
            System.out.println("{} прошел пешком {} км, может еще пройти {} км".formatted(name, distance, currentStamina));

            return true;
        }

        return  currentTransport.move(distance, terrain);

    }

    private double getConsumption(double distance) {
        return distance * STAMINA_CONSUMPTION_PER_KM;
    }
}
