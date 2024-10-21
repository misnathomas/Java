package javaprogram;
import java.util.Scanner;

public class Matrixmultiply {


	public static void main(String[]args)
			{
				Scanner in= new Scanner(System.in);
				int r1,c1,r2,c2,i,j,k;
				int[][] a=new int[40][40];
				int[][] b=new int[40][40];
				int[][] c=new int[40][40];
		        System.out.println("Enter the rows and columns of the matrix A:");
				r1=in.nextInt();
				c1=in.nextInt();
				
				System.out.println("Enter the elements:");
				for(i=0;i<r1;i++)
				{
					for(j=0;j<c1;j++)
					{
						System.out.println("a["+i+"]["+j+"]=");
						a[i][j]=in.nextInt();
					}
				}
				
					
					System.out.println("Enter the rows and columns of the matrix B:");
					r2=in.nextInt();
					c2=in.nextInt();
					if(c1!=r2)
					{
						 System.out.println("Matrix multiplication not possible:");
						 return;
					}
					
					
					System.out.println("Enter the elements:");
					for(i=0;i<r2;i++)
					{
						for(j=0;j<c2;j++)
						{
							System.out.println("b["+i+"]["+j+"]=");
						    b[i][j]=in.nextInt();
						}}
					
					
					
					
						for(i=0;i<r1;i++)
						{
							for(j=0;j<c2;j++)
							{
								c[i][j]=0;
								for(k=0;k<c1;k++)
								{
									c[i][j]+=a[i][k]*b[k][j];
								}
							}
						}
						System.out.println("Matrix A is:");
						for(i=0;i<r1;i++) {
							for(j=0;j<c1;j++) {
								System.out.print(a[i][j]+"\t");
							}
							System.out.println();
						}
						System.out.println("Matrix B is:");
						for(i=0;i<r2;i++) {
							for(j=0;j<c2;j++) {
								System.out.print(b[i][j]+"\t");
							}
							System.out.println();
						}
						System.out.println("Product of the two matrices is:");
						for(i=0;i<r1;i++) {
							for(j=0;j<c2;j++) {
								System.out.print(c[i][j]+"\t");
							}
							System.out.println();
						}
					}
				}
			
	




