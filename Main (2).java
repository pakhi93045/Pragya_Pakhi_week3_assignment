abstract class Animal {
    public abstract void sound();
    
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

interface Movable {
    void move();
}

class Dog extends Animal implements Movable {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void move() {
        System.out.println("Dog runs");
    }
}

class Bird extends Animal implements Movable {
    @Override
    public void sound() {
        System.out.println("Bird chirps");
    }

    @Override
    public void move() {
        System.out.println("Bird flies");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();
        
        dog.sound();
        dog.sleep();
        ((Movable) dog).move();

        bird.sound();
        bird.sleep();
        ((Movable) bird).move();
    }
}
