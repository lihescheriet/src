package starwars;

import java.util.ArrayList;
import java.util.Scanner;

public class Film {
	 	private String titre;
	    private String anneeDeSortie;
	    private String numeroEpisode;
	    private double cout;
	    private double recette;
	    private ArrayList Acteur = new ArrayList();
	    
	    /**
	     * Constructor
	     * 
	     * Film()
	     */
	    public Film() {}
	    
	    /**
	     * Constructor
	     * 
	     * Film(String titre, String anneeDeSortie, String numeroEpisode, String cout, String recette)
	     * @param titre
	     * @param anneeDeSortie
	     * @param numeroEpisode
	     * @param cout
	     * @param recette
	     */
	    public Film(String titre, String anneeDeSortie, String numeroEpisode, double cout, double recette) { this.titre = titre;
	        this.anneeDeSortie = anneeDeSortie;
	        this.numeroEpisode = numeroEpisode;
	        this.cout = cout;
	        this.recette = recette;
	    }
	    public Film(boolean nouveauFilm) {
	    	Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez ecrire le Titre du film :");
			this.titre = sc.nextLine();
			System.out.println("Vous avez saisi : " + this.titre);
			System.out.println("Veuillez ecrire l'Ann�e de sorti du Film :");
			this.anneeDeSortie = sc.nextLine();
			System.out.println("Vous avez Saisi : " + this.anneeDeSortie);
			System.out.println("Veuillez ecrire l'�pisode:");
			this.numeroEpisode = sc.nextLine();
			System.out.println("Vous avez Saisi : " + this.numeroEpisode);
			System.out.println("Veuillez ecrire le Cout:");
			this.cout = sc.nextDouble();
			System.out.println("Vous avez Saisi : " + this.cout);
			System.out.println("Veuillez ecrire la recette:");
			this.recette = sc.nextDouble();
			System.out.println("Vous avez Saisi : " + this.recette);
			sc.close();
	    }

	    // The methods of basic getter below.
	    public String getTitre() {
	        return titre;
	    }
	    public String getAnneeDeSortie() { return anneeDeSortie; }
	    public String getNumeroEpisode() { return numeroEpisode; }
	    public double getCout() { return cout; }
	    public double getRecette() { return recette; }

	    // The methods of basic setter below.
	    public void setTitre(String titre) { this.titre = titre; }
	    public void setAnneeDeSortie(String anneeDeSortie) { this.anneeDeSortie = anneeDeSortie; }
	    public void setNumeroEpisode(String numeroEpisode) { this.numeroEpisode = numeroEpisode; }
	    public void setCout(double cout) { this.cout = cout;}
	    public void setRecette(double recette) { this.recette = recette; }
	    
	    @Override
	    public String toString(){
	        return "Film : "+this.titre+" "+this.anneeDeSortie+" "+this.numeroEpisode+" "+this.cout+" "+this.recette;
	    }
}
