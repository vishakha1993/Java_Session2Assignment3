public class Pattern_print
{
	public static void main(String arg[])
	{
		int i,j;
		
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("\n");
		}
		
		for(i=4;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("\n");
		}
	}

}

