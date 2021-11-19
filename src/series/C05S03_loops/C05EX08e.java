package series.C05S03_loops;

public class C05EX08e {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                s += "*";
            }
            s += "-";
            System.out.println(s);
        }
    }
}
