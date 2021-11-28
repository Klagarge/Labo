package lab2_DataTypes;

public class task7 {

    public static void main(String[] args) {
        
        String s = TextTools.readText();
        s = TextTools.toUpperCase(s);
        System.out.println(s);
        System.out.println(TextTools.invert(s));
        System.out.println("Hello World");
        s = TextTools.toLowerCase(s);
        System.out.println(s);
        s = TextTools.deleteConsonants(s);
        System.out.println(s);
        s = TextTools.readText();
        s = TextTools.encrypt(s);
        System.out.println(s);
        System.out.println(s=TextTools.decrypt(s));

    }
    
}
