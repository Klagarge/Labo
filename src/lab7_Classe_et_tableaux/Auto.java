package lab7_Classe_et_tableaux;

/**
 * @author Rémi Heredero
 * @Klagarge
 */
public class Auto {
    private String name;
    private double horsepower;
    private double maxSpeed;
    public Consommation consommation = new Consommation();

    /**
     * Définition d'une voiture
     * @param name Nom du type de voiture
     * @param horsepower Puissance en chevaux
     * @param maxSpeed Vitesse maximale
     * @author Rémi Heredero
     */
    public Auto(String name, double horsepower, double maxSpeed){
        this.name = name;
        this.horsepower = horsepower;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Définition d'une voiture avec consommation mix
     * @param name Nom du type de voiture
     * @param horsepower Puissance en chevaux
     * @param maxSpeed Vitesse maximale
     * @param urban valeur en l/100km pen régime urbain
     * @author Rémi Heredero
     */
    public Auto(String name, double horsepower, double maxSpeed, double combined){
        this.name = name;
        this.horsepower = horsepower;
        this.maxSpeed = maxSpeed;
        consommation.combined = combined;
    }


    /**
     * Définition complète d'une voiture
     * @param name Nom du type de voiture
     * @param horsepower Puissance en chevaux
     * @param maxSpeed Vitesse maximale
     * @param urban valeur en l/100km pen régime urbain
     * @param highway valeur en l/100km pen régime autoroutier
     * @param combined valeur en l/100km pen régime combiné
     * @author Rémi Heredero
     */
    public Auto(String name, double horsepower, double maxSpeed, double urban, double highway, double combined){
        this.name = name;
        this.horsepower = horsepower;
        this.maxSpeed = maxSpeed;
        consommation.urban = urban;
        consommation.highway = highway;
        consommation.combined = combined;
    }

    /**
     * Renvoie sous forme de texte les caractéristique principale d'une voiture
     */
    public String toString() {
        String s = "";
        s += this.name;
        s += ", ";
        s += this.horsepower;
        s += " hp, ";
        s += this.maxSpeed;
        s += " km/h";
        return s;
    }

    /**
     * Test si une voiture est vraiment rapide (>200km/h)
     * @return vrai si la voiture est plus rapide que 200 km/h
     */
    public boolean isVeryFast() {
        boolean fast = false;
        if (this.maxSpeed>200) {
            fast = true;
        }
        return fast;
    }

    /**
     * Test si une voiture est "écologique"
     * @return vrai si la consommation mix est inférieur à 8 l/100km et la consommation urbaine <10l/100km
     */
    public boolean isEco() {
        boolean eco = false;
        if (consommation.combined<8 && consommation.urban<10) {
            eco = true;
        }
        return eco;
    }
}
