package vut.th.third;

public abstract class GraphicObject {
    protected int x;
    protected int y;

    public void draw() {
        System.out.println("Drawing: " + this.getClass().toString());
    }
}
