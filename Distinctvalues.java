import java.util.*;

public class Distinctvalues {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            
            
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();
                set.add(value);
            }
            
            
            System.out.println(set.size());
        }
    }
}