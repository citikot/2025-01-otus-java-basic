package ru.otus.homework4;

public class Box {
    private int width;
    private int length;
    private int height;
    private String color;
    private boolean closed;
    private String payload;

    public Box(int width, int length, int height, String color) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.color = color;
        this.closed = false;
        this.payload = "";
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public String getPayload() {
        return payload;
    }

    public void paintTo(String color) {
        this.color = color;
        System.out.println("Коробка перекрашена в " + color);
    }

    public void open() {
        if (closed) {
            closed = false;
            System.out.println("Коробка открыта!");
        }
    }

    public void close() {
        if (!closed) {
            closed = true;
            System.out.println("Коробка закрыта!");
        }
    }

    public boolean isClosed() {
        return closed;
    }

    public boolean isFull() {
        return !payload.isEmpty();
    }

    public boolean putPayload(String payload) {
        boolean success = false;
        if (isClosed()) {
            System.out.println("Коробка закрыта. Невозможно ничего положить. Сначала откройте коробку.");
        } else {
            if (isFull()) {
                System.out.println("Коробка занята. Сначала освободите коробку.");
            } else {
                System.out.println(String.format("В коробку положили %s.", payload));
                this.payload = payload;
                success = true;
            }
        }
        return success;
    }

    public boolean dropPayload() {
        boolean success = false;
        if (isClosed()) {
            System.out.println("Коробка закрыта. Невозможно освободить. Сначала откройте коробку.");
        } else {
            if (isFull()) {
                System.out.println(String.format("Из коробки вынули %s. Коробка готова к использованию.", payload));
                payload = "";
                success = true;
            } else {
                System.out.println("Коробка пуста. Нечего доставать.");
            }
        }

        return success;
    }

    public void printDescription() {
        System.out.println(String.format("Цвет коробки: %s", color));
        System.out.println(String.format("Размеры коробки: длина %d, ширина %d, высота %d.", length, width, height));
        if (this.isClosed()) {
            System.out.println("Коробка закрыта.");
        } else {
            System.out.println("Коробка открыта.");
        }
        if (this.isFull()) {
            System.out.println("Коробка занята.");
        } else {
            System.out.println("Коробка свободна.");
        }
    }
}
