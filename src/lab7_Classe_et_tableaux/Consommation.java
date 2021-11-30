package lab7_Classe_et_tableaux;

/**
 * @author Rémi Heredero
 * @Klagarge
 */
public class Consommation {
    double urban;
    double highway;
    double combined;

    Consommation(){};
    
    /**
     * Consommation mix
     * @param combined valeur en l/100km pen régime combiné
     */
    Consommation(double combined){
        this.combined = combined;
    }

    /**
     * Tous les types de consommation d'une voiture
     * @param urban valeur en l/100km pen régime urbain
     * @param highway valeur en l/100km pen régime autoroutier
     * @param combined valeur en l/100km pen régime combiné
     */
    Consommation(double urban, double highway, double combined){
        this.urban = urban;
        this.highway = highway;
        this.combined = combined;
    }
}
