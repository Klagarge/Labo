package various_tests;

// import hevs.utils.Input;

public class random {

    public static void main(String[] args) {
        String s = "héllo";
        System.out.println(s);
        s = "";
        while (true) {
            s = Input.readString();
            System.out.println(s);
        }
    }
    
}
