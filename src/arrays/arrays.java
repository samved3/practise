package arrays;

public class arrays {
	public static void reverse (int[] num, int n) {
		int[] rev= new int[n];
		
		for (int i=0;i<n;i++) {
			
			
			rev[i]=num[n-i-1];
			
			
		}
			
		
		System.out.println("This is the reverse");
		for(int k=0;k<n;k++)
		{
		System.out.println(rev[k]);
		
		}
	}

	
	

}
