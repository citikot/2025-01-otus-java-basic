package src.generics;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    protected List<T> storage = new ArrayList<>();

    public void addItem(T item) {
        storage.add(item);
    }

    public List<T> getStorage() {
        return storage;
    }

    public int weight() {
        int weight = 0;
        for (T item : this.storage) {
            weight += item.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> box) {
        return this.weight() == box.weight();
    }

    public <S extends Fruit> void shift(Box<S> box, Class<S> type) {

        for (T item : this.storage) {
            if (type.isInstance(item)) {
                S castedItem = type.cast(item);
                box.addItem(castedItem);
            }
        }

        this.storage.removeIf(type::isInstance);
    }
}
