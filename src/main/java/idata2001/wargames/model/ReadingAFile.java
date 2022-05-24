package idata2001.wargames.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Creates a class that is able to read files
 */
public class ReadingAFile {
    public static void main(String[] args)
    {
        Scanner in;
        try
        {
            in = new Scanner(new FileReader("arme.txt"));

            while(in.hasNext()){
                String line = in.nextLine();
                System.out.println(line);
            }

            in.close();
        }
        catch (FileNotFoundException e)
        {
            System.err.println("Error: file 'arme.txt' could not be opened. Does it exist?");
            System.exit(1);
        }
    }
}
