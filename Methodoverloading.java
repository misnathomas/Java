package javaprogram;

import java.util.Scanner;

class Mover{
	void area(double r) {
		double c=3.14*r*r;
		System.out.println("The area of the circle is:"+c);
	}
	void area(int l,int w) {
		int r= l*w;
		System.out.println("The area of the rectangle is:"+r);
	}
	void area(double b,double h ) {
		double t=0.5*b*h;
		System.out.println("The area of the triangle is:"+t);
	}
}
class Methodoverloading{
	public static void main(String[]args) {
			
		Scanner sc=new Scanner(System.in);
		Mover m =new Mover();
		System.out.println("Enter the radius:");
		double r = sc.nextDouble();
		m.area(r);
		System.out.println("Enter the length and breadth:");
		int l =sc.nextInt();
		int w =sc.nextInt();
		m.area(l,w);
		System.out.println("Enter the base and height:");
		double b =sc.nextDouble();
		double h =sc.nextDouble();
		m.area(b,h);
		sc.close();
			
	}
}

	
	
	  
		
	
	


