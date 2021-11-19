package lab6;

public class Task1 {
    public static void main(String[] args) {
        
        Person toto = new Person("Jean", "Neymar", 22, 1.7);
        Person jack = new Person("Jadk", "Ady", 22, 1.7);



        toto.display();
        jack.display();

        toto.birthday();
        jack.birthday();
        jack.birthday();

        toto.display();
        jack.display();


    }
}
