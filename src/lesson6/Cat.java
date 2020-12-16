package lesson6;

public class Cat extends Animal {

    //    У каждого животного есть ограничения на действия (
//    бег: кот 200 м., собака 500 м.;
//    прыжок: кот 2 м., собака 0.5 м.;
//    плавание: кот не умеет плавать, собака 10 м.).


    public Cat(String name, String color, int age, int runLimit, double jumpLimit) {
        super(name, color, age, runLimit, jumpLimit);
        this.swimingLimit = 0;

    }

    public Cat(String name, String color, int age) {
        super(name, color, age);
        this.jumpLimit = 2;
        this.runLimit = 200;
        this.swimingLimit = 0;


    }

    @Override
    public void run(int runLenght) {
        if (runLimit >= runLenght) {
            System.out.println("Кот " + super.getName() + " пробежал требуемые " + runLenght + " метров");
        } else {
            System.out.println("Кот " + super.getName() + " смог пробежать только " + runLimit + " метров на дистанции " + runLenght + " метров");
        }
    }

    @Override
    public void jump(double jumpHeight) {
        if (jumpLimit >= jumpHeight) {
            System.out.println("Кот " + super.getName() + " прыгнул на требуемые " + jumpHeight + " метров");

        } else {
            System.out.println("Кот " + super.getName() + " смог прыгнуть только на " + jumpLimit + " метров из требуемых " + jumpHeight + " метров");

        }
    }

    @Override
    public void swim(int swimLenght) {
        System.out.println("Кот " + super.getName() + ", как и все нормальные коты, не плавает");
        System.out.println();

    }
}




