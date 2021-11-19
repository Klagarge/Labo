package POO.T1_classes_et_objets;

public class Person {
    String surname; // Nom de famille
    String name; // Prénom
    int age; // Âge
    double height; // Taille

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
