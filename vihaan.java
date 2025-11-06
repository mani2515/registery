
import java.util.*;
public class vihaan {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vihan = new int[n];
        for(int i=0;i<n;i++){
            vihan[i] = sc.nextInt(); 
        }
        int val = sc.nextInt();
        int flag = -1;
        for(int i =0;i<n;i++){
            if(vihan[i] == val){
                flag = i;
                break;

            }

        }
        System.out.println(flag);


    }
    
}
