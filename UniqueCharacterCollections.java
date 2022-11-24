package week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.CheckedInputStream;

import org.testng.annotations.IFactoryAnnotation;

//PrintUniqueCharacter
	/*
	 * Problem
	 * 
	 * a) Take your name as input
	 * b) Print all unique characters only (any order)
	 * 
	 * Input:  babu
	 * Output: a u 
	 * 
	 */

	/*
	 * Psuedocode
	 * 
	 * a) Convert String to Character array
	 * b) Create a new Set -> HashSet
	 * c) Add each character to the Set and if it is already there, remove it
	 * d) Finally, print the set
	 * 
	 */
public class UniqueCharacterCollections {

	public static void main(String[] args) {

		
          String nameInput = "Kaleeswari";
          char[] n= nameInput.toLowerCase().toCharArray();
          
          boolean checkInput;          
          Set<Character> nameSet = new HashSet<Character>();
          
          for(int i=0;i<=n.length-1;i++)
          {
        	  checkInput = nameSet.add(n[i]);
        	  if(!checkInput)
        	  {
        		  if(nameSet.contains(n[i]))
        		  {
        		  nameSet.remove(n[i]);
        		  }
        	  }
        	  else
               nameSet.add(n[i]);
        		  
          }
          System.out.println(nameSet.toString().replace(",", " "));
		
	}

}
