package melo_problem1;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

class DuplicateRemover {
	
	//Arraylist that will carry the unique words to be passed into output file
    List<String> uniqueWords = new ArrayList<>();

    public void remove(String dataFile) throws FileNotFoundException {
    	try {
    		//BufferReader/FileReader will allow us to read the text on the input file 
    		BufferedReader br = new BufferedReader(new FileReader(dataFile));
    		//Read text from file
            String words = br.readLine();
           
            while (words != null) {
            	//Create a temporary array to store the words that will be separated by the split function
                String[] tempArr = words.split(" ");
                
                for (int i = 0;i < tempArr.length;i++) {
                    if (!uniqueWords.contains(tempArr[i])) {
                    	//The word is added if not repeated
                        uniqueWords.add(tempArr[i]);
                    }
                    
                }
                
                //Exit the loop
                words = br.readLine();
            
            }
            //Close buffer
            br.close();
            
        }catch(IOException err) { 
        	System.err.println("Caught IOException: " +  err.getMessage());
        }
    }

    public void write(String outputFile) throws FileNotFoundException {
    	try {
    		FileWriter fWriter = new FileWriter(outputFile);
    		//Go through the arraylist and write them into the outputfile
	        for (int i = 0;i < uniqueWords.size();i++) {
	        	fWriter.write(uniqueWords.get(i)+"\n");
	        }
	        //Close FileWriter
	        fWriter.close();
    	}catch(IOException err) { 
        	System.err.println("Caught IOException: " +  err.getMessage());
        }
    }
}