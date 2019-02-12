package praticePrograms;

public class Inheritance {
	
	public void add(float num1, float num2)	
	{
	 int sum = (int)num1 + (int) num2;
	 Float ans = num1 + num2;
	 System.out.println(sum);
	 System.out.println(ans);
	}
 
	public void subs(float num1, float num2 )
	{
		if (num1 > num2){
		int sum = (int)num1 - (int) num2;
		 Float ans = num1 - num2;
		 System.out.println(sum);
		 System.out.println(ans);
		}
		else {
			float temp = num1;
			num1 = num2;
			num2 = temp;
			subs(num1,num2);
			
		}
		
		}
	}

