import java.util.Scanner;
class Test
{
	public void printValue(int x){
		if(x<10)
			System.out.println(x);
		else
		{
			System.out.println(x%10);
			this.printValue(x/10);
		}
	}
	public static void main(String args[]){
		Test ob=new Test();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		ob.printValue(n);
	}
}
