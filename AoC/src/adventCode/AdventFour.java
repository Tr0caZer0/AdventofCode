package adventCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AdventFour {
	
	public static void main(String[] args) {
		readDoc();
	}

	private static void readDoc() {
		
		try(BufferedReader readData = new BufferedReader(new FileReader("adventFourth.txt"))){
			
			String details; 
			
			while((details = readData.readLine()) != null) {
				
				String[] detailSplit = details.split("|");
				
				for(int i = detailSplit.length -1 ; i >= 0; i--) {
					
					String[] splitSubArray = detailSplit[i].split("\s");
					
					if(i == 1) {
						
						
						
					}else if(i == 1) {
						
					}
				
				}
				
			}
			
		}catch(IOException e) {
			System.out.append("An error occured" + e);
		}
		
	}

}
