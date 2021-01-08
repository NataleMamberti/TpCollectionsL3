import java.util.ArrayList;
import java.util.Collection;

public class ex1 {
    public static void main (String[] args){
        ArrayList<ClasseUtilisantGenerique> listeTest= new ArrayList<ClasseUtilisantGenerique>();
        listeTest.add(new ClasseUtilisantGenerique(1,1));
        listeTest.add(new ClasseUtilisantGenerique('a',1));
        listeTest.add(new ClasseUtilisantGenerique(1,'a'));
        listeTest.add(new ClasseUtilisantGenerique("b",1));
        listeTest.add(new ClasseUtilisantGenerique(1,"b"));
        listeTest.add(new ClasseUtilisantGenerique(true,1));
        listeTest.add(new ClasseUtilisantGenerique(1,false));
        listeTest.add(new ClasseUtilisantGenerique(0.1f,2));

        for (int i = 0; i < listeTest.size(); i++) {
            System.out.println("Test ligne n" + i);
            System.out.println();
            System.out.println(listeTest.get(i).toString());
            System.out.println(listeTest.get(i).getFirst());
            System.out.println(listeTest.get(i).getSecond());
            listeTest.get(i).setFirst(0.1f);
            listeTest.get(i).setSecond("TEST");
            System.out.println(listeTest.get(i).getFirst());
            System.out.println(listeTest.get(i).getSecond());
            System.out.println(listeTest.get(i).toString());
            System.out.println();
            System.out.println("_______________________");
            System.out.println();
        }
    }
}
