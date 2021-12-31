package arrayProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayRemoiveDuplicate {
	
	 public static void main(String[] args) {
		
		 ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,2,2,4,6,7,2,3,5,4,3,8,2,8));
		 List<Integer> marksListUnique= marksList.stream().distinct().collect(Collectors.toList());
		 System.out.println(marksListUnique); 
	}

}
