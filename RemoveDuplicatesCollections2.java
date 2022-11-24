package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.IFactoryAnnotation;

public class RemoveDuplicatesCollections2 {

	public static void main(String[] args) {

		String inText = "Paypal India";
		char[] changeChar =	inText.toLowerCase().toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		for(int i=0;i<=changeChar.length-1;i++)
		{
			if(!charSet.contains(changeChar[i]))
			charSet.add(changeChar[i]);
			else
			dupCharSet.add(changeChar[i]);
		
		}

	     if(charSet.contains(dupCharSet))
        	charSet.remove(dupCharSet);
    	System.out.println("After Duplicates removal: " +charSet.toString().replace(",","").replace(" ","")); 
	}
}
