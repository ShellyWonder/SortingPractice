package main;

import java.util.Arrays;

import main.animals.Pig;
import main.service.FileService;

public class FarmerAlBaryardInventoryApplicationTwo {

	public static void main(String[] args) {
		
		FileService fileService = new FileService();
		Pig[] pigs = fileService.getPigsFromFile();
		String[] pigNames = new String[pigs.length];
  		
		// SORT the pigs by name...
		
		// 1. run a for loop on the pig array
		int i = 0;
		for(Pig pig: pigs) {
			
			try {
				// 2. In the for loop create an array called pig names, get the names of the pigs using		
				// the getName getter from the Pig class, save it into the pigNames string array
				if (pig != null) {
					pigNames[i] = pig.getName();
					i++;
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Program cannot read the file.");
				e.printStackTrace();
			}
			 
		}	
		pigNames = Arrays.copyOf(pigNames, i);
		// 3. Sort the pig names
		Arrays.sort(pigNames);	
		// 4. Print the sorted names to the console
		System.out.println(Arrays.toString(pigNames));
		
	}
}


