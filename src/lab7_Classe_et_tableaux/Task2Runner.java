package lab7_Classe_et_tableaux;

public class Task2Runner {
    public static void main(String[] args) {
        
        //Auto audi = new Auto("Audi TT", 135, 250);
        Garage perso = new Garage();
        perso.addCar(new Auto("Audi TT", 135, 250, 12, 7, 8.3));
        perso.addCar(new Auto("VW Golf", 100, 180, 9, 6.5, 7.5));
        perso.addCar(new Auto("Lancia Y", 60, 150, 8, 5, 6.6));
        perso.addCar(new Auto("Porsche 911", 400, 312, 35, 15, 20));
        System.out.println("Number of car in garage: " + perso.getNumberOfCars());
        System.out.println("");
        System.out.println(perso.toString());
        System.out.println("");
        System.out.println("Garage fast cars: \n" + perso.displayFastCars());
        System.out.println("");
        System.out.println("Garage \"eco\" cars: \n" + perso.displayEcoCars());
    }
}
