package lab2_DataTypes;
public class Task1 {
	
	public static void main(String[] args) {
		
		System.out.print("Veuillez entrer la première valeur: ");
		int valeur1 = Input.readInt();
		System.out.print("Veuillez entrer la deuxième valeur: ");
		int valeur2 = Input.readInt();
		System.out.print("Veuillez entrer la troisième valeur: ");
		int valeur3 = Input.readInt();

		int smallest = valeur1 < valeur2 ? valeur1 : valeur2;
		smallest = smallest < valeur3 ? smallest : valeur3;
		
		System.out.println("La plus petite valeur est la valeur: "+ smallest);
		
	}

}
