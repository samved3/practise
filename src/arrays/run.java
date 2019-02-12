package arrays;

import java.util.Scanner;

public class run extends arrays {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the size of array ");
	int n=sc.nextInt();
	int[] number=new int[n];
	
	for(int i=0;i<n;i++)
	{System.out.print("enter the values of array value");
		System.out.println(i+1);
		
		number[i]=sc.nextInt();
	}
	sc.close();
	reverse(number,n);
	
	
	
	
}
}
