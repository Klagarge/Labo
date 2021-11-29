package lab7_Classe_et_tableaux;

import java.awt.Color;

public class Task1Runner {
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle (10, 5);
        Rectangle r2 = new Rectangle (3, 4);
        Rectangle r3 = new Rectangle (100, 100);

        System.out.println(r1.area());
        System.out.println(r2);
        r3.changeColor(Color.GRAY);
        System.out.println(r3);
        
    }
}
