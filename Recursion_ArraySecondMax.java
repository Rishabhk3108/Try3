import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Test ob = new Test();
        ob.sum();
    }

    public void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements in array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array....");
        printArray(a, 0, n - 1); // Calling the helper method
        int secondMax = findSecondMax(a, 0, n - 1); // Calling the recursive method
        System.out.println("Second maximum: " + secondMax);
    }

    // Helper method to print the array
    public void printArray(int[] arr, int start, int end) {
        if (start > end) {
            return;
        }
        System.out.print(arr[start] + " ");
        printArray(arr, start + 1, end);
    }

    // Recursive method to find the second maximum element
    public int findSecondMax(int[] arr, int start, int end) {
        if (start == end) {
            return arr[start];
        } else if (start == end - 1) {
            return Math.max(arr[start], arr[end]);
        } else {
            int mid = (start + end) / 2;
            int leftMax = findSecondMax(arr, start, mid);
            int rightMax = findSecondMax(arr, mid + 1, end);
            return Math.max(leftMax, rightMax);
        }
    }
}