class Animal {

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Bird extends Animal {

    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping");
    }

    public void fly() {
        System.out.println("Bird is flying");
    }
}

public class HandsOnAssignment1 {

    public static void main(String[] args) {

        Animal animal = new Animal();

        System.out.println("Animal Class:");
        animal.eat();
        animal.sleep();

        System.out.println();

        Bird bird = new Bird();

        System.out.println("Bird Class:");
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}