package lab4_Fonctions;

public class task1 {

    public static int NbrL(String s, char l) {

        int total = 0;
        for (int i = 0; i < StringFunctions.stringLength(s); i++) {
            if (StringFunctions.stringCharAt(s, i)==l) {
                total += 1;
            }
        }
        return total;        
    }

    public static String inv(String s) {
        String result = "";
        int longeur = StringFunctions.stringLength(s);
        for (int i = 1; i <= longeur; i++) {
            result += StringFunctions.stringCharAt(s, (longeur-i)); 
        }
        return result;
    }


    public static void main(String[] args) {
        String s = Input.readString();
        /*for (int i = 0; i < 26; i++) {
            System.out.println("Nombre de " + (char)('a'+i) + ": " + NbrL(s, (char)(i+'a')));
        }*/
        for (char i = 'a'; i < 'z'; i++){ // boucle de a a Z
            System.out.println("Nombre de " + i + ": " + NbrL(s, i)); 

        }

    }
}