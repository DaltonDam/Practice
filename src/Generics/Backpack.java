package Generics;

import java.util.ArrayList;
import java.util.List;

public class Backpack<T> {
    private List<T> objects;

    public Backpack() {
        this.objects = new ArrayList<>();
    }

    //Add objects
    public void addObjects(T objectT) {
        objects.add(objectT);
    }

    public List<T> getObjects() {
        return objects;
    }

    public void setObjects(List<T> objects) {
        this.objects = objects;
    }

    @Override
    public String toString() {
        return "Backpack" + objects.toString();
    }
}
