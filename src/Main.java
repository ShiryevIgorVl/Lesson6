public class Main {

    public static void main (String[] args) {
        Animal dog = new Dog("Бобик", 150, 5, 500, 10);
        Animal cat = new Cat("Мурзик", 50, 2, 200, 0);

        dog.run("Бобик", 150, 500);
        cat.run("Мурзик", 50, 200);
        dog.sail("Бобик", 5, 10);
        cat.sail("Мурзик", 2, 0);


    }
}
