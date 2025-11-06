import java.util.*;
public class pmoney{
    public static void main(String[] args) {
        int n =7;
        int[] money = new int[n];
        try (Scanner sc = new Scanner(System.in)) {
            for(int i =0;i<n;i++){
                money[i] = sc.nextInt();
            }
        }
        int total = 0;
        int max=money[0];
        for(int i =0;i<n;i++){
            total+=money[i];

            if(max<money[i]){
                max=money[i];
            }
        }
        System.out.println(total);
        System.out.println(max);
        
    }
   

}
