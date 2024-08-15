import java.util.Scanner;

public class linear {

    public static int find(int arr[], int key) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array size = ");
        int n = sc.nextInt();
        System.out.print("enter the elements = ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter thge key = ");
        int key = sc.nextInt();

        int res = find(arr, key);
        if (res == -1) {
            System.out.println("not found");
        } else {
            System.out.println("key found at " + res + " index");
        }
    }
}
