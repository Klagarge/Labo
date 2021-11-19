package POO.T2_constructeurs;

public class Exercice4 {
    public static void main(String[] args) {
        Person john = new Person("John", "Doe", 19, 1.75);
        john.print();

        Person momo = new Person("Mathusalem");
        momo.print();
        momo.surname.toUpperCase();
        momo.print();;
    }
}
