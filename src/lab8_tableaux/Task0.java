package lab8_tableaux;

public class Task0 {
    public static void main(String[] args) {
        int[] foo = even_array(5);
        for (int i = 0; i < foo.length; i++) {
            System.out.println(foo[i]);
        }

    }

    public static int[] even_array(int n){
        int[] foo = new int[n];
        for (int i = 0; i < foo.length; i++) {
            foo[i] = i*2;
        }
        return foo;
    }
}
