package series.theorie;

import various_tests.Input;

public class C04EX0502 {
    public static void main(String[] args) {
        while (true) {
            int a = Input.readInt();
            boolean b = false;

            if (a%2 == 0) {
                b = true;
            }

            if(b){
                System.out.println("La variable est paire");
            } else {
                System.out.println("La variable est impaire");
            }
        }
        
    }
}
