package javaprogram;
import java.util.Scanner;
class Employee {
	String name;
	String address;
	int age;
	long phonenumber;
	float salary;
	Employee(String name1,String address1,int age1,long phonenumber1,float salary1){
		name=name1;
		address=address1;
		age=age1;
		phonenumber=phonenumber1;
		salary=salary1;
		}
	
	void printEmployee() {
	System.out.println("Name:"+name);
	System.out.println("Address:"+address);
	System.out.println("Age:"+age);
	System.out.println("Phonenumber:"+phonenumber);
	}
	void printSalary() {
		System.out.println("Salary:"+salary);
	}}
class Officer extends Employee{
	String specialization;
	Officer(String name1,String address1,int age1,long phonenumber1,float salary1,String specialization1){
		super(name1,address1,age1,phonenumber1,salary1);
		specialization=specialization1;
	}
void printSpecialization() {
	System.out.println("Specialization:"+specialization);
	}}
class Manager extends Employee {
	String department;
	Manager(String name1,String address1,int age1,long phonenumber1,float salary1,String department1){
	super(name1,address1,age1,phonenumber1,salary1);
	department=department1;
	}
void printDepartment() {
	System.out.println("Department:"+department);
	}}
public class HierInheritance {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String name;
		String address;
		int age;
		long phonenumber;
		float salary;
		String specialization;
		String department;
		System.out.println("Enter the details of the Officer:");
		System.out.print("Name:");
		name=sc.nextLine();
		System.out.print("Address:");
		address=sc.nextLine();
		System.out.print("Age:");
		age=sc.nextInt();
		System.out.print("Phonenumber:");
		phonenumber=sc.nextLong();
		System.out.print("Salary:");
		salary=sc.nextFloat();
		sc.nextLine();
		System.out.print("Specialization:");
		specialization=sc.nextLine();
		Officer off=new Officer(name,address,age,phonenumber,salary,specialization);
		System.out.println("Enter the details of the Manager:");
		System.out.print("Name:");
		name=sc.nextLine();
		System.out.print("Address:");
		address=sc.nextLine();
		System.out.print("Age:");
		age=sc.nextInt();
		System.out.print("Phonenumber:");
		phonenumber=sc.nextLong();
		System.out.print("Salary:");
		salary=sc.nextFloat();
		sc.nextLine();
		System.out.print("Department:");
		department=sc.nextLine();
		Manager man=new Manager(name,address,age,phonenumber,salary,department);
		System.out.println("******DETAILS OF OFFICER******");
		off.printEmployee();
		off.printSalary();
		off.printSpecialization();
		System.out.println("******DETAILS OF MANAGER******");
		man.printEmployee();
		man.printSalary();
		man.printDepartment();
		sc.close();
	}}








		
		
		
		
		
		
		
	
		
		
		
		
		
	


