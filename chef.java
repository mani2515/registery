import java.util.*;
public class chef{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            Map<String,String> entry = new HashMap<>();
            Map<String,Integer> chef = new TreeMap<>();
            Map<String,Integer> country = new TreeMap<>();
            int n = sc.nextInt();
            int m = sc.nextInt();
            for(int i=0;i<n;i++){
                String s1 = sc.next();
                String s2 = sc.next();
                entry.put(s1,s2);
            }
            for(int i=0;i<m;i++){
                String s1 = sc.next();
                chef.put(s1,chef.getOrDefault(s1,0)+1);
                String s2 = entry.get(s1);
                country.put(s2,country.getOrDefault(s2,0)+1);
            }
            int max=0;
            String res1 = "",res2 = "";
            for(String key : country.keySet()){
                if(country.get(key) > max){
                    max = country.get(key);
                    res1 = key;
                }
            }
            max=0;
            for(String key : chef.keySet()){
                if(chef.get(key) > max){
                    max=chef.get(key);
                    res2=key;
                }
            }
            System.out.println(res1 + "\n" + res2);
        }
        


    }



 

}








