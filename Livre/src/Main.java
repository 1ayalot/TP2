 
public class Main {
    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque();

        Livre livre1 = new Livre("La boite à merveille", "Ahmed Sefrioui", 1954);
     

        bibliotheque.ajouterLivre(livre1);


        bibliotheque.afficherLivres();
    }
}