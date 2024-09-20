package com.programmes;

public class AB 
{
	public static void main(String[] args)
	{
		int n=13245;
		int count=0;
		
		for(int i=1;i<n;i++)
		{
			if(i%2==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
