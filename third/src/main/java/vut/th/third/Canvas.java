package vut.th.third;

import java.util.LinkedList;

public class Canvas {
    private int height;
    private int width;
    private LinkedList<GraphicObject> objects;

    Canvas(int height, int width) {
        this.height = height;
        this.width = width;
        objects = new LinkedList<>();
    }

    public void addObject(GraphicObject obj) {
        objects.add(obj);
    }
    public void createRaster() {
        objects.forEach(object -> object.draw());
    }
}
