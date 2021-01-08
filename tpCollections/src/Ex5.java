import java.time.LocalDate;
import java.util.*;

public class Ex5 {
    public static void main (String[] args){
        Personne p1 = new Personne("Mamberti","Natale", LocalDate.of(1999,06,28));
        Personne p2 = new Personne("Giansily", "Hyacinthe",LocalDate.of(1999,12,12));
        Personne p3 = new Personne("Jean", "Castex",LocalDate.of(1965,06,25));
        ArrayList<Personne> liste = new ArrayList<>();
        liste.add(p1);
        liste.add(p2);
        liste.add(p3);
        System.out.println(liste);
        Collections.sort(liste, NAME_ORDER);
        System.out.println(liste);
        Collections.sort(liste, BIRTH_ORDER);
        System.out.println(liste);
    }

    static final Comparator<Personne> NAME_ORDER = new Comparator<Personne>() {
        @Override
        public int compare(Personne o1, Personne o2) {
            if ((o1.getNom()).compareTo(o2.getNom()) != 0){
                return (o1.getNom()).compareTo(o2.getNom());
            }
            else{
                return o1.getPrenom().compareTo(o2.getPrenom());
            }
        }
    };
    static final Comparator<Personne> BIRTH_ORDER = new Comparator<Personne>() {
        @Override
        public int compare(Personne o1, Personne o2) {
            LocalDate o1Date = o1.getDateDeNaissance();
            LocalDate o2Date = o2.getDateDeNaissance();
            if (!o1Date.isEqual(o2Date)){
                if(o1Date.isAfter(o2Date)){
                    return -1;
                }
                else {
                    return 1;
                }
            }
            else{
                return 0;
            }
        }
    };
}
