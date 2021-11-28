package lab4_Fonctions;

public class task3 {
    
    public static double areaTriangle(int side, double radius) {
        double alpha = ((360/side/2)*Math.PI)/180;
        double sideS = sideS(alpha, radius);
        double heightH = heightH(alpha, radius);
        double area = (sideS*heightH)/2;
        return area;
    }

    public static double sideS(double alpha, double radius) {
        return 2*radius*Math.sin(alpha);
    }

    public static double heightH(double alpha, double radius) {
        return radius*Math.cos(alpha);
    }

    public static void main(String[] args) {

        int side = 12;
        double radius = Math.sqrt(2)*5;
/*
        System.out.println("How many side of your polygon ?");
        side = Input.readInt();

        System.out.println("How big is your radius [cm] ?");
        radius = Input.readDouble();
*/
        double area = side * areaTriangle(side, radius);
        System.out.println("Total area = " + area + " [cm2]");

    }
}
