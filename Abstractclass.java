package javaprogram;
abstract class Shape{
	abstract void numberofsides();
}
class Rectangle extends Shape{
	int side;
	Rectangle(int side){
		this.side=side;
	}
	void numberofsides(){
		System.out.println("I AM RECTANGLE,Number of sides="+side);
	}}
class Triangle extends Shape{
	int side;
	Triangle(int side){
		this.side=side;
	}
	void numberofsides(){
		System.out.println("I AM TRIANGLE,Number of sides="+side);
	}}
class Hexagon extends Shape{
	int side;
	Hexagon(int side){
		this.side=side;
	}
	void numberofsides(){
		System.out.println("I AM HEXAGON,Number of sides="+side);
	}}
public class Abstractclass{
	public static void main(String[]args){
		Rectangle r=new Rectangle(4);
		Triangle t=new Triangle(3);
		Hexagon h=new Hexagon(6);
		r.numberofsides();
		t.numberofsides();
		h.numberofsides();
	}} 

		
