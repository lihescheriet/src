package starwars;

public class Personnage {
	private String _nom;
	private String _prenom;
	private String _role;
	
	public Personnage() {}
	
	public void Peronnage(String nom, String prenom, String role) {
		this._nom = nom;
		this._prenom = prenom;
		this._role = role;
		
	}

	public String get_nom() {
		return _nom;
	}

	public void set_nom(String _nom) {
		this._nom = _nom;
	}

	public String get_prenom() {
		return _prenom;
	}

	public void set_prenom(String _prenom) {
		this._prenom = _prenom; 
	}

	public String get_role() {
		return _role;
	}

	public void set_role(String _role) {
		this._role = _role;
	}
	public String toString() {
		return "nom de l'acteur est :"+ this.get_nom() + "Le prenom de lacteur est : " + this.get_prenom();
	}


}
