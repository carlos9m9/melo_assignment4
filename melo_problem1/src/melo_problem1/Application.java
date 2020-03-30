package melo_problem1;

import java.io.IOException;

public class Application {
    public static void main(String[] arg){
    	try {
	        DuplicateRemover duplicateRemover = new DuplicateRemover();
	        duplicateRemover.remove("problem1.txt");
	        duplicateRemover.write("unique_words.txt");
    	}catch(IOException err) { 
        	System.err.println("Caught IOException: " +  err.getMessage());
        }
    }
}