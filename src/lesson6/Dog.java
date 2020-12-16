package lesson6;

public class Dog extends Animal {

    public Dog(String name, String color, int age, int runLimit, double jumpLimit, int swimingLimit) {
        super(name, color, age, runLimit, jumpLimit, swimingLimit);
    }

    public Dog(String name, String color, int age) {
        super(name, color, age);
        this.runLimit = 500;
        this.jumpLimit = 0.5;
        this.swimingLimit = 10;
    }

    @Override
    public void run(int runLenght) {
        if (runLimit >= runLenght) {
            System.out.println("Собак " + super.getName() + " пробежал требуемые " + runLenght + " метров");

        } else {
            System.out.println("Собак " + super.getName() + " смог пробежать только " + runLimit + " метров на дистанции " + runLenght + " метров");

        }
    }

    @Override
    public void jump(double jumpHeight) {
        if (jumpLimit >= jumpHeight) {
            System.out.println("Собак " + super.getName() + " прыгнул на требуемые " + jumpHeight + " метров");

        } else {
            System.out.println("Собак " + super.getName() + " смог прыгнуть только на " + jumpLimit + " метров из требуемых " + jumpHeight + " метров");

        }
    }

    @Override
    public void swim(int swimLenght) {
        if (swimingLimit >= swimLenght) {
            System.out.println("Собак " + super.getName() + " проплыл требуемые " + swimLenght + " метров");

        } else {
            System.out.println("Собак " + super.getName() + " смог проплыть только " + swimingLimit + " метров на дистанции " + swimLenght + " метров");

        }
        System.out.println();
    }
}
