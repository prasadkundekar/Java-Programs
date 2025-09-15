interface Shape {
    double calculateArea();

    default void displayType() {
        System.out.println("This is a generic shape.");
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayType() {
        System.out.println("This is a Circle.");
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);

        Shape rectangle = new Rectangle(4.0, 6.0);

        System.out.println("--- Circle Details ---");
        circle.displayType();
        System.out.println("Area of Circle: " + circle.calculateArea());

        System.out.println();
        System.out.println("--- Rectangle Details ---");
        rectangle.displayType();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}