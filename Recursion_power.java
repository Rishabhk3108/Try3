import java.util.Scanner;
class Test
{
	public int power(int x,int y)
	{int result=0;
		if(y==0)
			return 1;
		else if(y!=0)
			result=this.power(x,y-1)*x;
		return result;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base value");
		int n=sc.nextInt();
		System.out.println("Enter the power value");
		int m=sc.nextInt();
		Test ob=new Test();
		int result=ob.power(n,m);
		System.out.println(result);
	}
}