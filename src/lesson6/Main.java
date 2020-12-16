package lesson6;

public class Main {
    public static void main(String[] args) {


        Cat cat = new Cat("Гендальф", "Серый", 2);
        Cat cat1 = new Cat("Арагорн", "Грязный", 2, 100, 3.6); // добавлен разброс в ограничениях


        Dog dog = new Dog("Гимли", "Белый", 2);
        Dog dog1 = new Dog("Глоин", "Бурый", 3, 600, 1, 20);


        cat.printInfo();
        cat1.printInfo();
        dog.printInfo();
        dog1.printInfo();

        cat.setRunLenght(100); // размеры препятствий задаются через setter-ы для каждого животного
        cat.setJumpHeight(1.1);
        cat.setSwimLenght(10);
        cat1.setRunLenght(150);
        cat1.setJumpHeight(4.3);
        cat1.setSwimLenght(5);

        dog.setRunLenght(350);
        dog.setJumpHeight(0.4);
        dog.setSwimLenght(5);
        dog1.setRunLenght(680);
        dog1.setJumpHeight(1.2);
        dog1.setSwimLenght(21);

        beastGo(cat);
        beastGo(cat1);

        beastGo(dog);
        beastGo(dog1);


    }

    public static void beastGo(Animal animal) { //метод для запуска автивности животного

        animal.run(animal.runLenght);
        animal.jump(animal.jumpHeight);
        animal.swim(animal.swimLenght);


    }
}
