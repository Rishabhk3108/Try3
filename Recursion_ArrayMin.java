import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        System.out.println("Enter elements in array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Test ob = new Test();
        System.out.println("\n" + ob.min(n, a));
    }

    public int min(int n, int a[]) {
        System.out.println("Array....");
        for (int i = 0; i < n; System.out.println(a[i] + " "), i++) ;
        return findMin(a, n - 1);
    }

    private int findMin(int a[], int index) {
        if (index == 0) {
            return a[0];
        }
        int min = findMin(a, index - 1);
		System.out.println("min"+min);
        if (a[index] < min) {
            return a[index];
        } else {
            return min;
        }
    }
}