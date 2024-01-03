import java.util.*;

public class subarray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] array = new int[4];

        for(int i = 0 ; i < array.length ; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("Max till? ");
        int k = sc.nextInt();

        sc.close();

        int max = array[0];
        for(int i = 0 ; i < k ; i++)
        {
            if(array[i] > max)
            {
                max = array[i];
            }
        }

        System.out.println("Maximum till "+k+" is "+max);
    }
    
}