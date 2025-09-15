public class StaticMethodAndVariable {

    public static int count = 0;
    private String name;

    public StaticMethodAndVariable(String name) {
        this.name = name;
        count++;
    }

    public static void displayCount() {
        System.out.println("Total objects created: " + count);
    }

    public void displayInfo() {
        System.out.println("Object name: " + this.name);
        System.out.println("Current count from this object: " + count);
    }

    public static void main(String[] args) {
        System.out.println("Initial count (accessed via class name): " + StaticMethodAndVariable.count);

        StaticMethodAndVariable.displayCount();

        StaticMethodAndVariable obj1 = new StaticMethodAndVariable("First Object");
        System.out.println("\nCreated obj1.");

        StaticMethodAndVariable obj2 = new StaticMethodAndVariable("Second Object");
        System.out.println("Created obj2.");

        System.out.println();
        StaticMethodAndVariable.displayCount();

        System.out.println();
        obj1.displayInfo();

        System.out.println();
        obj2.displayInfo();
    }
}