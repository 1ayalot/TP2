
import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Livre> listeDeLivres;

    public Bibliotheque() {
        this.listeDeLivres = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        listeDeLivres.add(livre);
    }

    public void afficherLivres() {
        if (listeDeLivres.isEmpty()) {
            System.out.println("La bibliothèque est vide.");
        } else {
            System.out.println("Livres disponibles dans la bibliothèque :");
            for (Livre livre : listeDeLivres) {
                livre.afficherDetails();
            }
        }
    }
    
    public void rechercherLivreParAuteur(String nomAuteur) {
        boolean found = false;
        for (Livre livre : listeDeLivres) {
            if (livre.auteur == nomAuteur) {
                livre.afficherDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Aucun livre trouvé pour l'auteur " + nomAuteur);
        }
    }
}