package javaprogram;

import java.util.Scanner;
public class Matrix {
	public static void main(String[]args)
	{
		Scanner in= new Scanner(System.in);
		int m,n,i,j;
		int[][] a=new int[20][20];
		System.out.println("Enter the rows and columns of the matrix:");
		m=in.nextInt();
		n=in.nextInt();
		System.out.println("Enter the elements:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.println("a["+i+"]["+j+"]=");
			    a[i][j]=in.nextInt();
			   
			}
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.println(a[i][j]+"\t");
			}
		}
		
		
	}
	

}
