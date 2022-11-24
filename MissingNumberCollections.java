package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Psuedocode
 * 
 * a) Remove the duplicates using Set
 * b) Make sure the set is in the ascending order
 * c) Iterate from the starting number and verify the next number is + 1
 * d) If did not match, that is the number
 * 
 */
public class MissingNumberCollections {

	public static void main(String[] args) {
		
            int[] numArray = {3,2,6,1,8,4,7};
            Arrays.sort(numArray);
            for(int j=0;j<=numArray.length-1;j++)
            {
            System.out.println(numArray[j]);
            }
            
            Map<Integer, Integer> numMap = new HashMap<Integer, Integer>(); 
           
            for(int i=0;i<=numArray.length-1;i++)
            {
            	numMap.put(numArray[i], i+1 );
            	if(numMap.containsKey(i) != numMap.containsValue(i))
            		System.out.println("The missing number is:" + i);
            	
            }
            
        } 
	}
	


