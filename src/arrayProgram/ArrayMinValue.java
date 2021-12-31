package arrayProgram;

public class ArrayMinValue {

	  public static void main(String[] args) {
			
			int [] a = {1,10, 15, 20, 25, 30, 35};
			int min = Integer.MAX_VALUE;
			
			for(int element:a)
			{
				if(element<min)
				{
					min=element;
				}
			}
				  System.out.println("max element is:"+min);
			}

		}

