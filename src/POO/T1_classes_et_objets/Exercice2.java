package POO.T1_classes_et_objets;

public class Exercice2 {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.color = "bleue";
        c1.maxSpeed = 250;
        c1.type = "Ford Raptor";
        System.out.println(c1.getStringRepresentation());
        
    }
}
