package javaprogram;
import java.util.Scanner;
public class Exception {
 public static void main(String[]args) {
	 Scanner sc=new Scanner(System.in);
	 char confirmation;
	 do {
		 System.out.println("Enter your choice:");
		 System.out.println("1:Arithmetic Operation");
		 System.out.println("2:Array Access");
		 int choice=sc.nextInt();
		 switch(choice) {
		 case 1:
			 try {
				 System.out.println("Enter the number to be divided:");
				 int divident=sc.nextInt();
				 System.out.println("Enter the divisor:");
				 int divisor=sc.nextInt();
				 int result=divident/divisor;
				 System.out.println("The result is:"+result);
			 }
			 catch(ArithmeticException e) {
				 System.out.println("Caught an exception:"+e.getMessage());
				}
			 break;
		 case 2:
			 try {
				 int array[]= {1,2,3};
				 System.out.println("Enter the array you want to access:");
				 int index=sc.nextInt();
				 System.out.println("The number in " +index+  "is "  +array[index]);
				 }
			 catch(ArrayIndexOutOfBoundsException e) {
				 System.out.println("Caught an exception:"+e.getMessage());
			 }
			 break;
			 default:
				 System.out.println("INVALID CHOICE");
				 break;
			 }
		 System.out.println("Do you want to continue? y/n");
		 confirmation=sc.next().charAt(0);
		 }
	 while(confirmation=='y'||confirmation=='Y');
	 if(confirmation=='n'||confirmation=='N') {
		 System.out.println("SUCCESSFULLY EXITED....");
	 }
	 }
 
 }

		
	


