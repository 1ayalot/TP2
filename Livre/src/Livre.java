
public class Livre {
	
	//Attribut
	public String titre;
	public String auteur;
	public int anneePublication;
	 
	// Constructeur
	public Livre(String titre, String auteur, int anneePublication) {
		this.titre = titre;
		this.auteur = auteur;
	    this.anneePublication = anneePublication;
	 }
	 
	 // Méthode afficherDetails
	 public void afficherDetails() {
		 System.out.println("Le titre : " + titre);
	     System.out.println("L'auteur : " + auteur);
	     System.out.println("L'année de publication : " + anneePublication);
	 }
}

