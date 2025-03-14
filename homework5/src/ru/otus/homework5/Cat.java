package src.ru.otus.homework5;

public class Cat extends Animal {

    public Cat(String name, int runSpeed, int stamina) {
        this.setName(name);
        this.setRunSpeed(runSpeed);
        this.setStamina(stamina);
    }

    @Override
    public double run(int distance) {
        return doAction("бежать", this.getName(), RUNNING_STAMINA_COST, distance, this.getRunSpeed());
    }

    @Override
    public double swim(int distance) {
        return doAction("плыть", this.getName(), Integer.MAX_VALUE, distance, 0);
    }
}
