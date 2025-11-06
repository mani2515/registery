import java.util.*;
public class maxword{
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            Map<String,Integer>mp = new TreeMap<>();
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                String s = sc.next();
                mp.put(s,mp.getOrDefault(s,0)+1);
            }
            String res = "";
            int max = 0;
            for(String key : mp.keySet()){
                if(mp.get(key) >= max){
                    max = mp.get(key);
                    res = key;
                }
            }
            System.out.println(res + " " + max);
        }
        
    }
    
}