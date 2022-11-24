package week3.day2;
/*
 * Input array numbers, each occurances
 * 
 * input: {2,3,5,6,3,2,1,4,2,1,6,-1};
 * output: 2 -> 3 , 3 -> 2, 4 -> 1 
 * 
 * Order: Ascending Order
 * 
 */

/*
 * Psuedcode:
 * 
 * 1) Create Map -> TreeMap
 * 2) For loop -> each number -> add to the map
 * 3) If it is exist -> update it with + 1
 * 	  Else -> new entry with 1 as value
 * 
 */
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.IFactoryAnnotation;

public class FindNumberoccurencesMap {

	public static void main(String[] args) {
		
		int[] num= {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		Map<Integer, Integer> numMap = new HashMap<Integer,Integer>();

		for(int i=0;i<=num.length-1; i++)
		{
			if (numMap.containsKey(num[i]))
			   numMap.put(num[i], numMap.get(num[i])+1);
			else {
				numMap.put(num[i], 1);
			}
			                 
		}
		
		System.out.println("Number of Elements:" +numMap.size());
		
		System.out.println("Time of occurences:" +numMap);
		
		
	}

}
