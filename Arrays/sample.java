
import java.util.*;

public class sample {

    public static void update(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 67, 78, 89 };

        update(arr);
        // System.out.println("length popf arr = " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

}