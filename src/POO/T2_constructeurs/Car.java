package POO.T2_constructeurs;

public class Car {
    String color = "";
    String type = "";
    int maxSpeed;

    public Car(String type, String color, int maxSpeed){
        this.type = type;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getStringRepresentation() {
        String s = type;
        s += " ";
        s += color;
        s += ", vitesse max: ";
        s += maxSpeed;
        s += "km/h";
        return s;
    }
}
