import java.util.* ;
import java.io.*;
public class Anagram {
    public static void main(String[] args){
        System.out.println(findAnagrams("dictionary",8));
    }

    public static  ArrayList<ClasseUtilisantGenerique> findAnagrams(String file, int limit){
        Map<String,List<String>> map = new HashMap<String,List<String>>();
        try{
            Scanner scan = new Scanner(new File("dictionary.txt"));
            while(scan.hasNext()){
                String word =  scan.next();
                String sortedWord = sort(word);
                if (map.containsKey(sortedWord)){
                    map.get(sortedWord).add(word);
                }
                else {
                    ArrayList<String> list = new ArrayList<String>();
                    list.add(word);
                    map.put(sortedWord,list);
                }
            }
        }catch(FileNotFoundException e){
            System.err.println("Le fichier n'a pas ete trouve...");
        }
        ArrayList<ClasseUtilisantGenerique> anagrams = new ArrayList<>();
        for (Map.Entry<String, List<String>> e : map.entrySet())
            if(e.getValue().size()>=limit){
                anagrams.add(new ClasseUtilisantGenerique(e.getValue().size(),e.getValue()));
        }
        return anagrams;
    }

    public static String sort(String word){
        char[] result = word.toCharArray();
        Arrays.sort(result);
        return new String(result);
    }

    public static boolean isAnagram(String word, Map<String, List<String>> map){
        if (map.containsKey(sort(word))){
            return true;
        }
        return false;
    }
}


