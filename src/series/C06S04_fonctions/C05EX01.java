package series.C06S04_fonctions;

import hevs.utils.Input;

public class C05EX01 {

    // a
    public static float cube(float x) {
        return x*x*x;
    }

    // b
    public static double puissance(int base, int exposant) {
        double resultat = 1.0;
        for (int i = 0; i < exposant; i++) {
            resultat *= base;
        }
        return resultat;
    }

    // c
    public static void f1() {
    }

    // d
    public static int NbrLettre(String s) {
        return 0;        
    }

    // e
    public static boolean f2(int x1, int x2, String s) {
        return false;
    }

    public static void main(String[] args) {
        int base = Input.readInt();
        int exposant = Input.readInt();
        System.out.println(puissance(base, exposant));
    }
}
