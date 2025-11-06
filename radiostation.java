import java.util.*;
public class radiostation {
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            HashMap<String,String> mp = new HashMap<>();
            int n = sc.nextInt();
            int m = sc.nextInt();
            for(int i=0;i<n;i++){
                String s1 = sc.next();
                String s2 = sc.next();
                s2 +=";";
                mp.put(s2,s1);


            }
            for(int i=0;i<m;i++){
                String s1 = sc.next();
                String s2 = sc.next();
                System.out.println(s1+" "+s2+" #"+mp.get(s2));
                
            }
        }

    }
    
}
