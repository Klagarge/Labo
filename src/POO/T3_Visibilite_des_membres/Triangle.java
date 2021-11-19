package POO.T3_Visibilite_des_membres;

public class Triangle {
    double base;
    double hauteur;

    Triangle(double base, double hauteur){
        this.base = base;
        this.hauteur = hauteur;
    }

    public double computeArea(){
        return (base*hauteur)/2;
    }
}
