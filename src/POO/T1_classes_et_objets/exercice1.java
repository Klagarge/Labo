package POO.T1_classes_et_objets;

public class exercice1 {
    public static void main(String[] args) {
        
        Person john;
        john = new Person();

        john.surname = "Doe";
        john.name = "John";
        john.age = 19;
        john.height = 1.75;

        Person mathusalem = new Person();

        mathusalem.name = "Mathusalem";
        mathusalem.age = 122;
        mathusalem.height = 1.2;

        john.print();
        mathusalem.print();

    }
}
