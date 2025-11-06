import java.util.*;
public class samedifferences {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-- > 0){
                HashMap<Integer,Integer>mp = new HashMap<>();
                int n = sc.nextInt();
                for(int i=0;i<n;i++){
                    int a = sc.nextInt();
                    mp.put((a-i),mp.getOrDefault((a-i),0) + 1);
                    
                }
                long pairs=0;
                for(Integer key : mp.keySet()){
                    long P = mp.get(key);
                    pairs += (P * (P-1))/2;
                }
                System.out.println(pairs);
                
            }
        }
    }
}