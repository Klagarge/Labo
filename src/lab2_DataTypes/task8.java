package lab2_DataTypes;

public class task8 {

    public static void main(String[] args) {
        
        String texte_en_string = TextTools.readText();
        texte_en_string = TextTools.capitalize(texte_en_string);
        texte_en_string = TextTools.invert(texte_en_string);
        texte_en_string = TextTools.capitalize(texte_en_string);
        texte_en_string = TextTools.invert(texte_en_string);
        System.out.println(texte_en_string);
        
    }
    
}
