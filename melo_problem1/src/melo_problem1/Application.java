package melo_problem1;

import java.io.IOException;

public abstract class Application {
    public static void main(String[] arg) throws IOException {
    	
        DuplicateRemover duplicateRemover = new DuplicateRemover();
        duplicateRemover.remove("problem1.txt");
        duplicateRemover.write("unique_words.txt");

    }
}