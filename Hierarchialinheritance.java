package javaprogram;
	
class A
		{
		   void methodA()
		   {
		      System.out.println("Hello");
		      		
		   }
		}
class B extends A
		{
		    void methodB()
		   {
		      System.out.println("people");
		   }
		}
class C extends A
		{
		  void methodC()
		  {
		     System.out.println("of the ");
		  }
		}
class D extends A
		{
		   void methodD()
		  {
		     System.out.println("internet");
		  }
		}
public class Hierarchialinheritance
		{
		  public static void main(String [] args)
		  {
		     
		     B obj1 = new B();
		     C obj2 = new C();
		     D obj3 = new D();
		     
		     obj1.methodA();
		     obj2.methodA();
		     obj3.methodA();
		     
		     
		  }
		}

	


