package adventCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class AdventTwo {
	
	public static void main(String[] args) {
		System.out.println(readDoc());
	}

	private static int readDoc() {
		
		int count = 0;
		int sum = 0;
		
		try(BufferedReader readData = new BufferedReader(new FileReader("adventSecond.txt"))){
			String details;
			int checkCounter = 0;
			
			while((details = readData.readLine()) != null) {
				count++;
				String[] splitLine = details.split("[;]");
				checkCounter = 0;
					
				for(int i = splitLine.length-1; i >= 0; i--) {
					int numberRed = 0;
					int numberGreen = 0;
					int numberBlue = 0;
					if(checkCounter >= 1) {
						break;
					}
					
					String[] splitSubSet = splitLine[i].split("[\s ,]");
					
					for(int j = splitSubSet.length-1; j >= 0; j--) {
						
						if(splitSubSet[j].equals("red")) {
							
							
							numberRed += Integer.parseInt(splitSubSet[j-1]);
							
							if(numberRed > 12) {
								checkCounter++;
								break;
							}		
									
						}else if(splitSubSet[j].equals("green")) {
									
							numberGreen += Integer.parseInt(splitSubSet[j-1]);
							if(numberGreen > 13) {
								checkCounter++;
								break;
							}
									
									
						}else if( splitSubSet[j].equals("blue")) {
									
							numberBlue += Integer.parseInt(splitSubSet[j-1]);
							if(numberBlue > 14) {
								checkCounter++;
								break;
							}
									
						}
						
					}
					
				}
				
				if((checkCounter == 0)) {
					sum = sum + count;
				}
					
			}
			System.out.println(count);
			readData.close();
			
		}catch(IOException e) {
			System.out.println("Ett fel har uppståt " + e);
		}
		
		return sum;
		
	}
	
}
