package adventCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class AdventOne {
	public static List<String> addIntegerToList = new ArrayList<>();
	public static List<String> addIntegerToList2 = new ArrayList<>();
	public static HashMap<String,String> numberArray = new HashMap<>();
	public static void main(String[] args) {
		addToMap();
		readDoc(); 
		StringBuilder convertInt = new StringBuilder();
		
		for(String temp : addIntegerToList) {
			String myInt2 = null;
			if(temp.length() > 2) {
				int n = temp.length();
				char first = temp.charAt(0);
				char last = temp.charAt(n-1);
				
				convertInt.append(first);
				convertInt.append(last);
			
				addIntegerToList2.add(convertInt.toString());
				convertInt = new StringBuilder();
			}else if(temp.length() > 0 && temp.length() < 2) {
				
				myInt2 = temp.concat(temp);
				addIntegerToList2.add(myInt2);
			}else{
				addIntegerToList2.add(temp);
			}
			
		}
		
		for(String temp : addIntegerToList) {
			System.out.println(temp);
		}
		
		int sum = 0;
		for(String temp : addIntegerToList2) {
			
			int value = Integer.parseInt(temp);
			
			sum += value;
		}
		
		System.out.print(sum);
		
	}

	private static void addToMap() {
		numberArray.put("one", "1");
		numberArray.put("two", "2");
		numberArray.put("three", "3");
		numberArray.put("four", "4");
		numberArray.put("five", "5");
		numberArray.put("six", "6");
		numberArray.put("seven", "7");
		numberArray.put("eight", "8"); 
		numberArray.put("nine", "9");
		
	}

	private static void readDoc() {
		
	StringBuilder collectNumbers = new StringBuilder();
	StringBuilder collectLetter = new StringBuilder();
	
		try(BufferedReader toReadData = new BufferedReader(new FileReader("adventDocTest.txt")) ){
			
			String details;
			while((details = toReadData.readLine()) != null) {
				
			for(char ch : details.toCharArray()) {
					if(Character.isDigit(ch)) {
						
					collectNumbers.append(ch);
						
					}else {
						
						if(Character.isLetter(ch)) {
							collectLetter.append(ch);
						}
						
						for(Map.Entry<String, String> entry : numberArray.entrySet()) {
							if(collectLetter.toString().equalsIgnoreCase(entry.getKey())) {
								collectNumbers.append(entry.getValue());
								collectLetter = new StringBuilder();
							}
								
						}
					}
				}
			addIntegerToList.add(collectNumbers.toString());
			collectNumbers = new StringBuilder();
			collectLetter = new StringBuilder();
			
			
			}
		toReadData.close();
		}catch(IOException e) {
			System.out.println("Ett fel har uppstått" + e);
		}
		
	}// End readDoc method

}
