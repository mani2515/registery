import java.util.*;
public class elementsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] mani = new int[N];
        for(int i=0;i<N;i++){
            mani[i] = sc.nextInt();
        }
        int x = sc.nextInt();


        boolean flag = false;
        for(int i=0;i<N;i++){
            int element = sc.nextInt();
            if(element == x){
                break;
            } 
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }

    }
    
}
