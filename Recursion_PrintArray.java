import java.util.Scanner;
class Test1{}
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Test ob=new Test();
		System.out.println("Enter the length of the array");
		int n=sc.nextInt();
		int a[]=ob.createArray(sc,n,ob);
		System.out.println("Array is....");
		ob.printArray(a,n);
	}
	private int[] createArray(Scanner sc,int n,Test ob)
	{
		int a[]=new int[n];
		return ob.arrayInput(sc,n,a,0);
		
	}
	public int[] arrayInput(Scanner sc,int n,int a[],int i)
	{
		if(i>=n)
			return a;
		a[i]=sc.nextInt();
		this.arrayInput(sc,n,a,i+1);
		return a;
	}
		private int[] printArray(int a[],int n)
		{
			for(int i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}
			return a;
		}
}