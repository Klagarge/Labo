package series.C05S03_loops;

import various_tests.Input;

public class C05EX01b {
    public static void main(String[] args) {
        double a = Input.readDouble();
        if (a>=0) {
            System.out.println(Math.sqrt(a));
        } else {
            System.out.println("error");
        }
    }
}
