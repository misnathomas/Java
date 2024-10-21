package javaprogram;
import java.io.*;
public class Createfile {
public static void main(String[] args) {
 try {
	 File obj=new File("filename2.txt");
if(obj.createNewFile()) {
	System.out.println("File is created:"+obj.getName());
}
else {
	System.out.println("File already exists.");
}
System.out.println(obj.getAbsolutePath());
}
catch(IOException e) {
	System.out.println("An error occured");
	e.printStackTrace();
}}}



