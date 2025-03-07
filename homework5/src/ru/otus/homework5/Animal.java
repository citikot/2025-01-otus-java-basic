package src.ru.otus.homework5;

public abstract class Animal {

    private String name;
    private int runSpeed;
    private int swimSpeed;
    private int stamina;

    protected final int RUNNING_STAMINA_COST = 1;

    public abstract double run(int distance);
    public abstract double swim(int distance);

    public void info() {
        System.out.println("Остаток выносливости у " + name + ": " + stamina + " единиц.");
    }

    protected double doAction(String action, String name, int actionCost, int distance, int speed) {
        if (distance > stamina / actionCost) {
            System.out.println(name + " устал " + action);
            this.setStamina(0);
            return -1;
        }
        this.setStamina(stamina - distance * actionCost);
        return (double) distance / speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int wimSpeed) {
        this.swimSpeed = wimSpeed;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}
