package starwars;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Film filmStarWars = new Film("un nouvel espoir", "1977", "�pisode 4", 8.000000, 323.000000);
		Film filmStarWars1 = new Film("L'Empire contre-attaque", "1980", "�pisode 5", 33.000000, 400.000000);
		Film filmStarWars2 = new Film("Le Retour du Jedi", "1983", "�pisode 6", 35.500000, 475.000000);
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez ecrire le Titre du film :");
		String title = sc.nextLine();
		System.out.println("Vous avez saisi : " + title);
		System.out.println("Veuillez ecrire l'Ann�e de sorti du Film :");
		String date = sc.nextLine();
		System.out.println("Vous avez Saisi : " + date);
		System.out.println("Veuillez ecrire l'�pisode:");
		String nb = sc.nextLine();
		System.out.println("Vous avez Saisi : " + nb);
		System.out.println("Veuillez ecrire le Cout:");
		String c = sc.nextLine();
		System.out.println("Vous avez Saisi : " + c);
		System.out.println("Veuillez ecrire la recette:");
		String r = sc.nextLine();
		System.out.println("Vous avez Saisi : " + r);
	}
}
