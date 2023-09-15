import java.util.Scanner;
class Test{
    public  int fibonacci(int n) {
        // Fibonacci of 0 is 0, Fibonacci of 1 is 1
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
		Test ob=new Test();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count");
        int count = sc.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.print(ob.fibonacci(i) + " ");
        }
    }
}