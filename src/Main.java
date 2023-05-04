public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсік");
        Cat cat2 = new Cat("Мурзік");
        Dog dog1 = new Dog("Бобік");

        cat1.run(150);
        cat1.swim(5);

        cat2.run(250);
        cat2.swim(5);

        dog1.run(400);
        dog1.swim(7);

        System.out.println("Створено тварин: " + Animal.getCount());
        System.out.println("Котів: " + Cat.getCount());
        System.out.println("Собак: " + Dog.getCount());
    }
}
