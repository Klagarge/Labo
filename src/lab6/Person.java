package lab6;

public class Person {
    String surname = "";
    String name = "";
    int age;
    double height;

    Person(String name, String surname, int age, double d){
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.height = d;
    }

    void birthday(){
        age++;
    }

    void display(){
        System.out.print(name);
        System.out.print(" ");
        System.out.print(surname);
        System.out.print(", ");
        System.out.print(age);
        System.out.print(", ");
        System.out.print(height);
        System.out.println("m.");
    }
}
