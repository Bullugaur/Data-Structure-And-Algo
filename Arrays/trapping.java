import java.util.*;

public class trapping {

    public static void find(int arr[]) {

        // calculate lawft max boundary
        int n = arr.length;
        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }

        // calculate right max boundady
        int rightMax[] = new int[n];
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }

        int trapped = 0;
        // loop
        for (int i = 0; i < n; i++) {

            // waterlevel=min(leftmax bound, right max bound)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = waterlevel-height
            trapped += waterlevel - arr[i];
        }
        System.out.println("water level = " + trapped);

    }

    public static void main(String[] args) {

        //Scanner class 
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array = ");
        int n = sc.nextInt();
         
        System.out.print("enter the elements = ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        find(arr);
    }
}
