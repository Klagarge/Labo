package lab7_Classe_et_tableaux;

import java.awt.Color;

/**
 * @author Rémi Heredero
 * @Klagarge
 */
public class Rectangle {
    private double width;
    private double height;
    private Color color;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
        color = Color.RED;
    }

    public String toString(){
        String s = "";
        s += "Rectangle size : ";
        s += this.width;
        s += " x ";
        s += this.height;
        s += "\n Color: ";
        s += this.color;
        return s;
    }

    public void changeColor(Color c) {
        this.color = c;
    }

    public double area() {
        return this.width * this.height;
    }
}
