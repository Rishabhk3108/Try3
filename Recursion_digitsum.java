import java.util.Scanner;
class Test
{
	public int printValue(int x){
		int sum=0;
		if(x<10)
			return x;
		else
		{
			sum=(x%10)+(printValue(x/10));
			return sum;
		}
	}
	public static void main(String args[]){
		Test ob=new Test();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		System.out.println(ob.printValue(n));
	}
}
