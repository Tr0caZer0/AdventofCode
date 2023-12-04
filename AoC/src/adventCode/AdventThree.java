package adventCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AdventThree {
	
	public static void main(String[] args) {
		readDoc();
	}

	private static void readDoc() {
		StringBuilder charToInt = new StringBuilder();
		
		try(BufferedReader readData = new BufferedReader(new FileReader("adventThird.txt") )){
			String details;
			while((details = readData.readLine()) != null){
				
				char[] splitDetails = details.toCharArray();
				
				for(int i = 0; i < splitDetails.length; i++) {
					
					if(Character.isDigit(splitDetails[i])) {
						
						//Append to build integer
						//Save specific index location
						
					}else if(splitDetails[i] != '.') {
						//Save specific index location
					}
					
					
					
				}
				System.out.println("");
			}
			
		}catch(IOException e) {
			System.out.println("An Error occured" + e);
		}
		
	}
}
