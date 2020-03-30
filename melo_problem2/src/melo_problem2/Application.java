package melo_problem2;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {
    	try {
	        DuplicateCounter dc = new DuplicateCounter();
	        dc.count("problem2.txt");
	        dc.write("unique_word_counts.txt");
    	}catch(IOException err) { 
        	System.err.println("Caught IOException: " +  err.getMessage());
        }
    }
}