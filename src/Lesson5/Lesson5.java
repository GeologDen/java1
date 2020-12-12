package Lesson5;

public class Lesson5 {

    private static final int requiredAge = 40;

    public static void main(String[] args) {

        Employee employee1 = new Employee("Иванов", "Иван", "Иванович", "уборщик",
                "gsgsg@gmail.com", "89112223344", 70000, 39);

        employee1.printInfo();                      //метод, который выводит информацию об объекте в консоль

        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Горбовский",
                "Леонид",
                "Андреевич",
                "гендир",
                "111@comcon.su",
                "19173679479",
                1,
                83);

        employeesArray[1] = new Employee("Петров",
                "Аристарх",
                "Сергеевич",
                "инженер",
                "123@gmail.com",
                "89005550055",
                30000,
                33);

        employeesArray[2] = new Employee("Ленин",
                "Владимир",
                "Ильич",
                "вождь",
                "123@yahoo.com",
                "84956235527",
                100,
                150);

        employeesArray[3] = new Employee("Сидоров",
                "Игорь",
                "Игоревич",
                "инженер",
                "123@tesla.com",
                "12345678910",
                32000,
                22);

        employeesArray[4] = new Employee("Быков",
                "Авр",
                "Фпрлраплч",
                "инженер",
                "123@mail.com",
                "8953123213",
                50000,
                27);


        printEmployeesDependOfAge(employeesArray);     // вывод информации о сотрудниках старше определенного возраста


    }

    public static void printEmployeesDependOfAge(Employee[] employeesArray) {
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].age > requiredAge) {
                System.out.println(employeesArray[i]);
            }

        }
    }


}
