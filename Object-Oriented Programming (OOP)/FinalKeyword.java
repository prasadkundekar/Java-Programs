public class FinalKeyword {

    private final String name;
    public static final double PI = 3.14159;

    public FinalKeyword(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Object Name: " + name);
        System.out.println("Value of PI: " + PI);
    }

    public final void greeting() {
        System.out.println("Hello from the parent class!");
    }

    public final static class ImmutableExample {
        private final int value;

        public ImmutableExample(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword("Example Object");
        obj.displayInfo();

        System.out.println("\nTrying to re-assign final variable...");
        System.out.println("Re-assignment is prevented by the 'final' keyword.");

        System.out.println("\n--- Final Method Demonstration ---");
        MySubClass sub = new MySubClass("SubClass Object");
        sub.greeting(); // The subclass uses the final method from the parent class.

        System.out.println("\n--- Final Class Demonstration ---");
        ImmutableExample immutableObj = new ImmutableExample(100);
        System.out.println("Value from the final class object: " + immutableObj.getValue());
        System.out.println("Cannot extend a final class. See the commented code.");
    }
}

class MySubClass extends FinalKeyword {
    public MySubClass(String name) {
        super(name);
    }
}