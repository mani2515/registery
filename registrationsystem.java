import java.util.*;
public class registrationsystem {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            HashMap<String,Integer> mp = new HashMap<>();
            for(int i=0;i<n;i++){
                String s = sc.next();
                if(mp.containsKey(s)){
                    System.out.println(s+mp.get(s));
                    mp.put(s,mp.get(s)+1);
                }
                else{
                    System.out.println("ok");
                    mp.put(s,1);
                }

            }
        }
        
    }
}
    

