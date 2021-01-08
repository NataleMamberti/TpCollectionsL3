import java.util.*;

public class ListesTriées {
    public static void main (String[] args){
        System.out.println(listeTriee(50));
        System.out.println(listeTrieeV2(50));
    }

    public static ArrayList<Integer> listeTriee(int n){
        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            l.add(new Random().nextInt(1001));
        }
        Collections.sort(l);
        return l;
    }
    public static Set<Integer> listeTrieeV2(int n){
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set.add(new Random().nextInt(1001));
        }
        return set;
    }

}
