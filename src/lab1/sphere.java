package lab1;
public class sphere {
	public static void main(String args[])
	{
		double rayon = 0;
		double epaisseur = 0;
	

		
		
		System.out.print("Veuillez entrer le rayon de la sphère en cm : ");
		rayon = Input.readDouble();
		
		System.out.print("Veuillez entrer l'épaisseur de la sphère : ");
		epaisseur = Input.readDouble();
		
		double rayonInt = rayon - epaisseur;
		double volume = 0;
		double volumeInt = 0;
		volume = (4*Math.PI*rayon*rayon*rayon)/3;
		volumeInt = (4*Math.PI*rayonInt*rayonInt*rayonInt)/3;
		
		System.out.println("Le volume total est de " + volume + " cm3");
		
		double densite = 0;
		System.out.print("Veuillez entrer la densité de la matière en g/cm3: ");
		densite = Input.readDouble();
		
		double poid = 0;
		poid = densite*(volume-volumeInt);
		
		System.out.print("La densité total est de " + poid/volume + " => ");
		
		if(poid/volume < 1) {
			System.out.println("L'object flotte");
		} else {
			System.out.println("L'object ne flotte pas");
		}
		
		
    }
}
