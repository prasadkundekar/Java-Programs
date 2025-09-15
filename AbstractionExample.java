
public abstract class AbstractionExample {
    public abstract double calculateArea();

    public void displayMessage() {
        System.out.println("This is a geometric shape.");
    }

    public static class Circle extends AbstractionExample {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    public static void main(String[] args) {
        AbstractionExample circle = new Circle(5.0);
        circle.displayMessage();
        System.out.println("Area of the Circle: " + circle.calculateArea());
    }
}