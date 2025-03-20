package ru.otus.homework7.domain;

public class Human {

    private final double STAMINA = 30;
    private final double STAMINA_CONSUMPTION_PER_KM = 3;

    private String name;
    private Transport currentTransport;
    private double currentStamina = STAMINA;

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
                System.out.println(String.format("%s столько не пройдет пешком. Нет больше сил.", name));
                return false;
            }
            currentStamina -= getConsumption(distance);
            System.out.println(String.format(
                    "%s прошел пешком %.2f км по местности: %s. Может еще пройти %.2f км.",
                    name, distance, terrain != null ? terrain.getName() : "неизвестной", currentStamina
            ));

            return true;
        }

        return currentTransport.move(this, distance, terrain);

    }

    public double getCurrentStamina() {
        return currentStamina;
    }

    public void setCurrentStamina(double currentStamina) {
        this.currentStamina = currentStamina;
    }

    public double getConsumption(double distance) {
        return distance * STAMINA_CONSUMPTION_PER_KM;
    }
}
