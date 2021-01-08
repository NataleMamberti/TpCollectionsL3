import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Comparaisons {
    public static void main (String[] args){
        ArrayList<String> l = new ArrayList<>(Arrays.asList("a","b","c","ddd","aaa"));
        comparaison(l);
        comparaison(l,"military");
    }

    public static void comparaison(ArrayList<String> l){
        final Comparator<String> MILITARY_ORDER = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()<o2.length()){
                    return -1;
                }
                else if (o1.length()==o2.length()){
                    return o1.compareTo(o2);
                }
                else {
                    return 1;
                }
            }
        };
        Collections.sort(l);
        System.out.println(l);
        Collections.sort(l, MILITARY_ORDER);
        System.out.println(l);
        Collections.sort(l, Collections.reverseOrder());
        System.out.println(l);
    }
    public static void comparaison(ArrayList<String> l, String type){
        final Comparator<String> MILITARY_ORDER = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()<o2.length()){
                    return -1;
                }
                else if (o1.length()==o2.length()){
                    return o1.compareTo(o2);
                }
                else {
                    return 1;
                }
            }
        };
        switch (type){
            case "lexico":
                Collections.sort(l);
                break;
            case "military":
                Collections.sort(l,MILITARY_ORDER);
                break;
            case "lexico inverse":
                Collections.sort(l,Collections.reverseOrder());
                break;
        }
        System.out.println(l);
    }
}
