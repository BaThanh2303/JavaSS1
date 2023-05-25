package demo4;

import Demo.Honda;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        Toyota t = new Toyota();
        Honda h = new Honda();
        t.run();
        System.out.println(t.getBrand());
        h.speedUp();
        System.out.println(h.getBrand());
        Car.type = "Moto and Car";

        Human human = new Human() { //anonymous class
            @Override
            public void eat() {

            }

            @Override
            public void walk() {

            }
        };
    }
}
