public class largestNo {

    public static void find(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8,10, 5, 3, 6, 9 };
        find(arr);
    }
    
}
