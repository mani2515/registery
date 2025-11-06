import java.util.*;

public class customsort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++){
                arr.add(sc.nextInt());
            }
            Collections.sort(arr,(a,b)->b-a);
            for(Integer a : arr){
                System.out.println(a + " ");
            }
        }
        
    }
}
    

