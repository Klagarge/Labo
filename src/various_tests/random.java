package various_tests;


// import hevs.utils.Input;

public class random {

    

    public static int nbr(boolean a, boolean b, boolean c) {
        int nbr = 0;
        if (a) {
            nbr+=1;
        }
        if (b) {
            nbr+=1;
        }
        if (c) {
            nbr+=1;
        }
        return nbr;
    }

    public static char alpha(char a, char b) {
        return a<b?a:b;
    }

    public static void main(String[] args) {
        System.out.println(alpha(Input.readChar(), Input.readChar()));;
    }
    
}
