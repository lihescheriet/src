package starwars;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
		Film filmStarWars = new Film("un nouvel espoir", "1977", "�pisode 4", 8.000000, 323.000000);
		Film filmStarWars1 = new Film("L'Empire contre-attaque", "1980", "�pisode 5", 33.000000, 400.000000);
		Film filmStarWars2 = new Film(true);
		
		
		ArrayList<Film> films = new ArrayList();
		films.add(filmStarWars);
		films.add(filmStarWars1);
		films.add(filmStarWars2);
		 
	}
}
