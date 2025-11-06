import java.util.*;

public class report {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] report = new int[n];
             int count = 0;

            for( int i =0;i<n-1;i++){
                report[i] = count;
                for(int j=0;j<n;j++){
                    if(report[i]<report[i+1]){
                        count++;
                    }
                }
            }
        }
    }
    
}
