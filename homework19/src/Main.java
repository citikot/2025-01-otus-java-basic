package src;

import src.generics.Apple;
import src.generics.Box;
import src.generics.Fruit;
import src.generics.Orange;

public class Main {

    public static void main(String[] args) {

        Box<Fruit> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();
        Box<Apple> box3 = new Box<>();

        box1.addItem(new Orange(1));
        box1.addItem(new Apple(1));
        box1.addItem(new Apple(1));
        box1.addItem(new Apple(1));

        System.out.println("Вес коробки с фруктами: " + box1.weight());

        box2.addItem(new Orange(1));
        box2.addItem(new Orange(1));
        box2.addItem(new Orange(1));
        box2.addItem(new Orange(1));

        System.out.println("Вес коробки с апельсинами: " + box2.weight());

        box3.addItem(new Apple(1));
        box3.addItem(new Apple(1));
        box3.addItem(new Apple(1));
        box3.addItem(new Apple(1));
        box3.addItem(new Apple(1));

        System.out.println("Вес коробки с яблоками: " + box3.weight());

        System.out.println("Корбка с яблоками весит столько же, сколько коробка с апельсинами: " + box3.compare(box2));
        System.out.println("Корбка с апельсинами весит столько же, сколько коробка с фруктами: " + box2.compare(box1));

        System.out.println("Коробка с фруктами: " + box1.getStorage());
        System.out.println("Коробка с апельсинами: " + box2.getStorage());
        System.out.println("Коробка с яблоками: " + box3.getStorage());
        System.out.println("__________________________________");
        System.out.println("Пересыпаем яблоки к фруктам");
        box3.shift(box1, Fruit.class);
        System.out.println("Коробка с фруктами: " + box1.getStorage());
        System.out.println("Коробка с яблоками пуста: " + box3.getStorage());
        System.out.println("__________________________________");
        System.out.println("Пересыпаем апельсины к фруктам");
        box2.shift(box1, Fruit.class);
        System.out.println("Коробка с фруктами: " + box1.getStorage());
        System.out.println("Коробка с апельсинами пуста: " + box2.getStorage());
        System.out.println("__________________________________");
        System.out.println("Пересыпаем фрукты к апельсинам");
        box1.shift(box2, Orange.class);
        System.out.println("Коробка с апельсинами (поместились только апельсины): " + box2.getStorage());
        System.out.println("Коробка с фруктами (остались только яблоки): " + box1.getStorage());
        System.out.println("__________________________________");
        System.out.println("Пересыпаем фрукты (яблоки) к яблокам");
        box1.shift(box3, Apple.class);
        System.out.println("Коробка с фруктами: " + box1.getStorage());
        System.out.println("Коробка с яблоками: " + box3.getStorage());
        System.out.println("__________________________________");
        System.out.println("Пересыпаем яблоки к апельсинам");
        box3.shift(box2, Orange.class);
        System.out.println("Коробка с апельсинами: " + box2.getStorage());
        System.out.println("Коробка с яблоками: " + box3.getStorage());
    }
}
