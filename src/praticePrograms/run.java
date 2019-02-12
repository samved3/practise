package praticePrograms;
import java.util.*;

import praticePrograms.Inheritance;

public class run {
	
	public static void main(String[] args) {
		Inheritance in = new Inheritance();
		System.out.println("Enter the value of number 1");
		Scanner sc=  new Scanner(System.in);
		float num1=sc.nextFloat();
		System.out.println("Enter the value of number 2");
		Float num2=sc.nextFloat();
		in.add(num1,num2);
		in.subs(num1, num2);
		
		
	}
}
