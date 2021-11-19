package POO.T3_Visibilite_des_membres;

public class Exercice5 {
    public static void main(String[] args) {
        
        Triangle t = new Triangle(5, 2);
        System.out.println(t.computeArea());
        System.out.println(computeTriangleArea(t));
    }

    public static double computeTriangleArea(Triangle t){
        return (t.base*t.hauteur)/2;
    }
}
