import java.util.*;

public class Main{    
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array :");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array  :");
        int arr[] = new int[n+1];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        System.out.println("Maximum element in the given array : " + arr[n-1]);
    }
    
}
