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
        System.out.println("\n" + ob.max(n, a));
    }

    public int max(int n, int a[]) {
        System.out.println("Array....");
        for (int i = 0; i < n; System.out.println(a[i] + " "), i++) ;
        return findMax(a, n - 1);
    }

    private int findMax(int a[], int index) {
        if (index == 0) {
            return a[0];
        }
        int max = findMax(a, index - 1);
		System.out.println("max"+max);
        if (a[index] > max) {
            return a[index];
        } else {
            return max;
        }
    }
}