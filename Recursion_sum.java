class Test
{
	public int sum(int x){
		int sum=0;
		if(x==0)
			return 0;
		else if(x==1)
			return 1;
		else
			sum=this.sum(x-1)+x;
		return sum;
	}
	public static void main(String args[]){
		Test ob=new Test();
		System.out.println(ob.sum(5));
	}
}