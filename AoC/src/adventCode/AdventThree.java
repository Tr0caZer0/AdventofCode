package adventCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AdventThree {
	
	public static List<Integer> indexCheckOne = new ArrayList<>();
	public static List<Integer> indexCheckTwo = new ArrayList<>();
	
	public static void main(String[] args) {
		readDoc();
	}

	private static void readDoc() {
		
		int counter = 0;
		
		try(BufferedReader readData = new BufferedReader(new FileReader("adventThird.txt") )){
			String details;
			while((details = readData.readLine()) != null){
				counter++;
				
				char[] splitDetails = details.toCharArray();
				
				if(counter%2 == 0) {
					catchIndexOne(splitDetails);
				}else {
					catchIndexTwo(splitDetails);
				}
				
				System.out.println("");
			}
			
		}catch(IOException e) {
			System.out.println("An Error occured" + e);
		}
		
	}

	private static void catchIndexTwo(char[] splitDetails) {
		StringBuilder charToInt = new StringBuilder();
		
		for(int i = 0; i < splitDetails.length; i++) {
			
			if(Character.isDigit(splitDetails[i])) {
				
				//Append to build integer
				//Save specific index location
				
			}else if(splitDetails[i] != '.') {
				//Save specific index location
			}
			
			
			
		}
		
	}

	private static void catchIndexOne(char[] splitDetails) {
		StringBuilder charToInt = new StringBuilder();
		
		for(int i = 0; i < splitDetails.length; i++) {
			
			if(Character.isDigit(splitDetails[i])) {
				
				//Append to build integer
				//Save specific index location
				
			}else if(splitDetails[i] != '.') {
				//Save specific index location
			}
			
			
			
		}
		
	}
}
