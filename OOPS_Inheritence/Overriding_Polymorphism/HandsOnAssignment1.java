class Fruit {

    String name;
    String taste;
    String size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

class Apple extends Fruit {

    Apple() {
        super("Apple", "Sweet", "Medium");
    }

    @Override
    public void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

class Orange extends Fruit {

    Orange() {
        super("Orange", "Sour", "Medium");
    }

    @Override
    public void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

public class HandsOnAssignment1 {

    public static void main(String[] args) {

        Apple apple = new Apple();
        Orange orange = new Orange();

        apple.eat();
        orange.eat();
    }
}