package POO.T5_autoboxing_des_types_primitifs;

public class Main {
    public static void main(String[] args) {
        //Integer foo = new Integer(15);
        //System.out.println(foo.toHexString(foo.intValue()));
        String s = "12";
        System.out.println(Integer.parseInt(s)+5);
        int bar = 17;
        Integer barInteger = bar;
        System.out.println(barInteger+2);
        Double foobarDouble = 3.0;
        double foobar = foobarDouble;
        System.out.println(foobar);

    }
}
