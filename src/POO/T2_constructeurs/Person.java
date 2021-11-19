package POO.T2_constructeurs;

public class Person {
    String surname = ""; // Nom de famille
    String name = ""; // Prénom
    int age; // Âge
    double height; // Taille

    public Person(String name, String surname, int age, double height){
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Person(String name){
        this(name, "", 0, 0);
    }

    public void print() {
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
