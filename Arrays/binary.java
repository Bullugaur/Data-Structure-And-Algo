public class binary {

    public static int find(int arr[], int key) {
        int start = 0;
        int last = arr.length - 1;
        while (start <= last) {
            int mid = (start + last) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                last = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int key = 0;
        int res = find(arr, key);
        if (res == -1) {
            System.out.print("nnot found");
        } else {
            System.out.println("found at = " + res);
        }
    }
}
