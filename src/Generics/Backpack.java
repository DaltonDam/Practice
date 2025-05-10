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

    public void showObject() {
        for (T object : objects) {
            System.out.println(object);
        }
    }

    public void forI() {
        for (int i = 0; i < objects.size(); i++) {
            System.out.println(objects);
        }
    }
}
