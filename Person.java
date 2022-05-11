public class Person {
    String name;
    String surname;
    int age;

    void print() {
        System.out.println("Class Person. Object: personObj");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
    }

    int countOfMonth() {
        return age * 12;
    }
}
