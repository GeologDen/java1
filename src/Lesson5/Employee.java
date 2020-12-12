package Lesson5;

public class Employee {

    protected String surname;
    protected String name;
    protected String patronymic;
    protected String position;
    protected String email;
    protected String phoneNumber;
    protected int salary;
    protected int age;




    public Employee(String surname, String name, String patronymic, String position, String email, String phoneNumber,
                    int salary, int age) {
        this.surname = surname != null ? surname.toUpperCase() : null;
        this.name = name != null ? name.toUpperCase() : null;
        this.patronymic = patronymic != null ? patronymic.toUpperCase() : null;
        this.position = position != null ? position.toUpperCase() : null;
        this.email = email != null ? email.toUpperCase() : null;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }

    public void printInfo() {
        System.out.println(this);
    }

    public String toString() {
        return "Данные сотрудника" +
                "\nФамилия: " + surname +
                "\nИмя: " + name +
                "\nОтчество: " + patronymic +
                "\nДолжность: " + position +
                "\nemail: " + email +
                "\nтелефон: " + phoneNumber +
                "\nЗарплата: $" + salary +
                "\nВозраст: " + age +
                "\n";
    }


}
