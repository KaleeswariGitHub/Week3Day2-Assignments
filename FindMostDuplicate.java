package week3.day2;
/*
//Assignment3:Find the most duplicate number -> First most duplicate
* input: abbaba
	 * output: b
	 * 
	 * 
	 */


//import com.fasterxml.jackson.annotation.JacksonInject.Value;

/*
	 * Psuedocode
	 * 
	 * 1) Map -> HashMap 
	 * 2) String -> ch[] -> Get all the character -> occurance
	 * 3) Keep comparing the occurance with other values -> max value -> character
	 * 
	 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindMostDuplicate {

	public static void main(String[] args) {
		
		String inputChar = "abbaaba";
		int occ=0,occ1=0;
		char[] c= inputChar.toCharArray();
		char key = 0,key1=0;
		Map<Character, Integer> inCharMap = new HashMap<Character, Integer>();
		
		for(char ch : c)
        {
             inCharMap.put(ch, inCharMap.getOrDefault(ch,0)+1) ;   
        }
		System.out.println(inCharMap);
		System.out.println("Values are:"+ inCharMap.values());
	
		Set<Entry<Character, Integer>> newEntry = inCharMap.entrySet();
		for(Entry<Character, Integer> nEntry: newEntry)
		{
			if(nEntry.getValue()> occ)
			{
              occ= nEntry.getValue();
              key= nEntry.getKey();
			}
			else
			{	
			  occ1=nEntry.getValue();
			  key1 = nEntry.getKey();
			}
		}
		
		System.out.println("The most duplicated key is: "+ key);
		System.err.println("Number of occurences: "+ occ);

  
	
	}

}
