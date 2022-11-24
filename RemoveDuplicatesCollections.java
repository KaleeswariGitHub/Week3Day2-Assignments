package week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.IFactoryAnnotation;

import java.util.Map.Entry;

/*
 * Pseudo code  using collections
 
 * a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";		
 * b) Initialize an integer variable as count	  
 * c) Split the String into array and iterate over it 
 * d) Initialize another loop to check whether the word is there in the array
 * e) if it is available then increase and count by 1. 
 * f) if the count > 1 then replace the word as "" 
 
 * g) Displaying the String without duplicate words	
 */

public class RemoveDuplicatesCollections {

	public static void main(String[] args) {
		String inText = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] splitWord = inText.split(" ");
		
		List<String> listWord = new ArrayList<String>();
		
		for (int i=0; i<= splitWord.length-1;i++)
		{
			if(listWord.contains(splitWord[i]))
				count++;
			else
				listWord.add(splitWord[i]);
		}
		
		System.out.println(listWord);
	String newValueString = listWord.toString().replaceAll(",", "");
	System.out.println(newValueString);
		
		
	}
}