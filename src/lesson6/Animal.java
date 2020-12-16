package lesson6;

public abstract class Animal {

    protected String name;
    protected String color;
    protected int age;
    protected int runLimit;
    protected double jumpLimit;
    protected int swimingLimit;

    protected int runLenght;
    protected int swimLenght;
    protected double jumpHeight;


    public Animal(String name, String color, int age, int runLimit, double jumpLimit, int swimingLimit) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.swimingLimit = swimingLimit;
    }

    public Animal(String name, String color, int age, int runLimit, double jumpLimit) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public abstract void run(int runLenght);

    public abstract void jump(double jumpHeight);

    public abstract void swim(int swimLenght);

    public void setRunLenght(int runLenght) { //TODO прописать проверку вводимых данных
        this.runLenght = runLenght;
    }

    public void setSwimLenght(int swimLenght) { //TODO прописать проверку вводимых данных
        this.swimLenght = swimLenght;
    }

    public void setJumpHeight(double jumpHeight) { //TODO прописать проверку вводимых данных
        this.jumpHeight = jumpHeight;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        if (swimingLimit == 0) {

            return ("Имя животного: " + name + " \nЦвет: " + color + ", \nВозраст: " + age + " лет \nДальность бега: " + runLimit +
                    " м. \nВысота прыга: " + jumpLimit + " м. \nЖывотное не плавает\n");

        } else {

            return ("Имя животного: " + name + " \nЦвет: " + color + " \nВозраст: " + age + " лет \nДальность бега: " + runLimit +
                    " м. \nВысота прыга: " + jumpLimit + " м. \nДальность заплыва: " + swimingLimit + " м.\n");
        }
    }
}
