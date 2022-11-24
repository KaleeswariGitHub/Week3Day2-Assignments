package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

//Here is the input
		//int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//       output= 7;

		/*
		 * Pseudo Code: 
		 * a) Create a empty Set Using TreeSet
		 * b) Declare for loop iterator from 0 to data.length and add into Set 
		 * c) converted Set into List
		 * d) Print the second last element from List
		 * 
		 * 
		 */
public class FindSecondLargestNumberCollections {

	public static void main(String[] args) {
		
		int[] inputData = {3,2,11,4,6,7,2,3,3,6,7};
		
		TreeSet<Integer> treeData = new TreeSet<Integer>();
		
		for(int i=0;i<=inputData.length-1;i++)
		{
			treeData.add(inputData[i]);
		}
		
		System.out.println("The elements in treeset is: " + treeData);
		
		List<Integer> conTreeToList = new ArrayList<Integer>(treeData);
		
    	int treeSize =	treeData.size();
	    System.out.println("The second largest number in the list is: "+conTreeToList.get(treeSize-2));
		
			
	}

}
