import java.time.LocalDate;

public class Personne {
    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;

    public Personne(String nom,String prenom, LocalDate dateDeNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public String toString(){
        return nom + " " + prenom;
    }
}
