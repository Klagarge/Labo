package lab1;
public class Fuel
{
	public static void main(String args[])
	{
		double litre = 0;
		double distance = 0;

		
		System.out.println("Calculateur de conssomation d'essence.");
		
		System.out.print("Veuillez entrer la conssomation moyenne de votre voiture : ");
		litre = Input.readDouble();
		
		System.out.print("Veuillez entrer le nombre de kilom�tre parcourus : ");
		distance = Input.readDouble();
		
		double consso = 0;
		consso = litre  * (distance/100);
		
		System.out.println("Votre conssomation a été de " + consso + " litres d'essence");
    }
}
