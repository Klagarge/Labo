package series.theorie;
import hevs.utils.Input;

public class C06EX06 {

    public static int somme(int x1, int x2, int x3){
            return x1+x2+x3;
    }

    public static double petit(double x1, double x2) {
        return x1<x2?x1:x2;
    }

    public static void main(String[] args) {
        System.out.println("La somme est: " + somme(Input.readInt(), Input.readInt(), Input.readInt()));
        System.out.println("Le plus petit nombre est: " + petit(Input.readDouble(), Input.readDouble()));
    }
    
}
