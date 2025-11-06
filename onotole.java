import java.io.*;
import java.util.*;
public class onotole{
    public static void main(String[] args) throws NumberFormatException,IOException{
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> mp = new HashMap<>();
        int n=Integer.parseInt(sc.readLine());
        for(int i=0;i<n;i++)
        {
            int a=Integer.parseInt(sc.readLine());
            mp.put(a,mp.getOrDefault(a,0)+1);
        }
        for(Integer key:mp.keySet())
        {
            if(mp.get(key)==1)
            {
                System.out.println(key);
                break;
            }
        } 
    }
}