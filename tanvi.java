import java.util.*;
public class tanvi 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tanvi = new int[n];
        for(int i=0;i<n;i++)
        {
            tanvi[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(tanvi[i] == 1)
            {
                count++;
            }
          

        }
  
        System.out.println(count);
    }
}


