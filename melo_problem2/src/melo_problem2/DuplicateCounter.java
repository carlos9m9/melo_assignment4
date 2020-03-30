package melo_problem2;

import java.util.HashMap;
import java.util.Map;
import java.io.*;

class DuplicateCounter {

    Map<String, Integer> counter = new HashMap<String, Integer>();

    public void count(String dataFile) throws FileNotFoundException {
    	try {
    		//BufferReader/FileReader will allow us to read the text on the input file 
    		BufferedReader br = new BufferedReader(new FileReader(dataFile));
    		//Read text from file
            String words = br.readLine();
	        
	        while (words != null) {
	        	//Create a temporary array to store the words that will be separated by the split function
	            String temp[] = words.split(" ");
	            
	            for (int i=0;i<temp.length;i++) {
	            	//The word is added if not repeated
	                if (!counter.containsKey(temp[i])) {
	                	counter.put(temp[i], 1);
	                } else {
	                    int x = counter.get(temp[i]);
	                    counter.put(temp[i], x + 1);
	                }
	            }
	            
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
    		//Write into the outputfile using the hashmap
	        for (Map.Entry<String, Integer> entry: counter.entrySet()) {
	        	fWriter.write(entry.getKey() + " = " + entry.getValue() + "\n");
	        }
	        //Close FileWriter
	        fWriter.close();
        
    	}catch(IOException err) { 
        	System.err.println("Caught IOException: " +  err.getMessage());
        }
    }
}	