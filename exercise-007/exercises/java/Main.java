package exercises.java;

public class Main {


    public static void main(String[] args) {

        Circle oval = new Circle();

        oval.setColor("green");
        oval.setRadius(12d);

        System.out.println(String.format("Circle of color %s has a radius of %s and an area of %s.", oval.getColor(), oval.getRadius(), oval.getArea()));
    }
}
