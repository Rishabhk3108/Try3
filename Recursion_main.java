 class Test
{
    static int i=0;
    public static void main(String args[])
    {
		if(i<10)
		{
        System.out.println("Hello"+(i++));
        main(args);
		}
    }
}