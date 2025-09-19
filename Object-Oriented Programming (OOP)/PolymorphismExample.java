class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound();
        myCat.sound();

        Calculator calc = new Calculator();
        System.out.println("Sum of two numbers: " + calc.add(5, 10));
        System.out.println("Sum of three numbers: " + calc.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + calc.add(5.5, 10.5));
    }
}