import java.util.*;
public class FrequencyArray{


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");

        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");

        

        int[] freq = new int[100001];
        System.out.println("Enter " + freq + " elements");

     
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            freq[arr[i]]++;
        }

        int x = sc.nextInt();

        if (freq[x] > 0)
            System.out.println("Present");
        else
            System.out.println("Not Present");
    }
}
