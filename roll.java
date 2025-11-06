import java.util.*;

public class roll {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] even = new int[n];
            int[] odd = new int[n];


            int e = 0;
            int o = 0;

            for(int i =0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                if(arr[i]%2==0){
                    even[e++]=arr[i];
                }else{
                    odd[o++]=arr[i];
                }
            }
            System.out.print("arr:- ");
            for(int i=0;i<n;i++)
                 System.out.print(arr[i]+" ");
   

            System.out.print("\neven:-");
            for(int i =0;i<e;i++)
                System.out.print(even[i]+" ");
            System.out.print("\nodd:- ");
            for(int i =0;i<o;i++){
                System.out.print(odd[i]+" ");
            }
        }
            

        
    }     
    
}
