import java.util.*;

public class Problem24 { 

  public static int factorial(int n) { 

        int k = 1; 

        for (int i = 1; i <= n; i++) { 
            k *= i; 
        } 

        return k; 

    } 

    public static void main(String[] args) { 

        List<Integer> list = new LinkedList<Integer>(); 

        int N = 10; 

        for (int i = 0; i < N; i++) { 
            list.add(i); 
        } 

        String perm = ""; 
        int remaining = 1000000 - 1; 

        for (int i = 1; i < N; i++) { 

            int digit = remaining / factorial(N - i); 
            remaining = remaining % factorial(N - i); 
            perm += String.valueOf(list.get(digit)); 
            list.remove(digit); 

            if (remaining == 0) { 
                break; 
            } 
        } 

        for (int i = 0; i < list.size(); i++) { 
            perm = perm + list.get(i); 
        } 

        System.out.println(perm); 
    } 
} 
