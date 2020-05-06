package exercises.java;

public class Circle {

    private double radius;
    private String color;


    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
