package lab7_Classe_et_tableaux;

/**
 * @author Rémi Heredero
 * @Klagarge
 */
public class Garage {
    private Auto[] stock = new Auto[100];
    private int nbrOfCars = 0;

    /**
     * Ajout d'une voiture
     * @param a objet de Classe Auto
     */
    public void addCar(Auto a) {
        stock[nbrOfCars] = a;
        this.nbrOfCars++;
    }

    /**
     * Retourne le nombre de voiture présente dans le garage
     * @return le nombre de voiture dans le garage
     */
    public int getNumberOfCars() {
        return this.nbrOfCars;
    }

    /**
     * Retourne sous forme de String toutes les voitures présente dans le garage
     */
    public String toString() {
        String s = "";
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null) {
                s += "Car ";
                s += i;
                s += " : ";
                s += stock[i].toString();
                s += "\n";
            }
        }
        return s;
    }

    /**
     * Retourne sous forme de String les voiture vraiment rapide (>200km/h) présente dans le garage
     * @return Liste des voiture qui vont à plus de 200 km/h
     */
    public String displayFastCars() {
        String s = "";
        for (int i = 0; i < stock.length; i++) {
            if ((stock[i] != null) && (stock[i].isVeryFast())) {
                s += "Car ";
                s += i;
                s += " : ";
                s += stock[i].toString();
                s += "\n";
            }
        }
        return s;
    }

    /**
     * Retourne toutes les voitures "écologique" présente dans le garage
     * @return liste des voiture <8l/100km mix et <10l/100km urbain présentent dans le garage
     */
    public String displayEcoCars() {
        String s = "";
        for (int i = 0; i < stock.length; i++) {
            if ((stock[i] != null) && (stock[i].isEco())) {
                s += "Car ";
                s += i;
                s += " : ";
                s += stock[i].toString();
                s += "\n";
            }
        }
        return s;
    }
}
