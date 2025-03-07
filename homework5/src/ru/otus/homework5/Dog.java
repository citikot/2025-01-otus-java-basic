package src.ru.otus.homework5;

public class Dog extends Animal {

    private final int SWIMMING_STAMINA_COST = 2;

    public Dog(String name, int runSpeed, int swimSpeed, int stamina) {
        this.setName(name);
        this.setRunSpeed(runSpeed);
        this.setSwimSpeed(swimSpeed);
        this.setStamina(stamina);
    }

    @Override
    public double run(int distance) {
        return doAction("бежать", this.getName(), RUNNING_STAMINA_COST, distance, this.getRunSpeed());
    }

    @Override
    public double swim(int distance) {
        return doAction("плыть", this.getName(), SWIMMING_STAMINA_COST, distance, this.getSwimSpeed());
    }
}
