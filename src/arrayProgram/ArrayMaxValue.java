package arrayProgram;

public class ArrayMaxValue {
	
	  public static void main(String[] args) {
		
	int [] a = {1,10, 15, 20, 25, 30, 35};
	int max = Integer.MIN_VALUE;
	
	for(int element:a)
	{
		if(element>max)
		{
			max=element;
		}
	}
		  System.out.println("max element is:"+max);
	}

}
