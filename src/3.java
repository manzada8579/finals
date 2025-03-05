import java.util.Scanner; 
public class Solution { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int[] arr = new int[n]; 
        for (int i = 0; i < n; i++) { 
            arr[i] = sc.nextInt(); 
        } 
        System.out.println(getMaxElement(arr)); 
    } 
    public static int getMaxElement(int[] arr) { 
        if (arr == null || arr.length == 0) return -1; 
        int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) { 
            if (max < arr[i]) max = arr[i]; 
        } 
        return max; 
    } 
}