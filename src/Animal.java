public class Animal {
    private static int count = 0;
    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        count++;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробіг " + distance + " м");
        } else {
            System.out.println(name + " не зміг пробігти " + distance + " м");
        }
    }

    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(name + " не вміє плавати");
        } else if (distance <= maxSwimDistance) {
            System.out.println(name + " проплив " + distance + " м");
        } else {
            System.out.println(name + " не зміг проплисти " + distance + " м");
        }
    }

    public static int getCount() {
        return count;
    }
}
