import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StopWords
{
    public static void main(String[] args) throws Exception
    {
        // stopwords arraylist
        ArrayList<String> stopWords = new ArrayList<>();
        Scanner s = null; // for file reading
        Scanner userInput = new Scanner(System.in); // for user input of path
        try
        {
            // "C:\Users\sionp\Documents\class\25-26\fall\cpsc\lab\stopwords.txt"
            System.out.println("What is the path of your stopwords.txt file?");
            s = new Scanner(new BufferedReader(new FileReader(userInput.nextLine())));
            while(s.hasNextLine())
            {
                stopWords.add(s.nextLine());
            }
            System.out.println("Stop words: " + stopWords);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found. Please try again.");
        }
        catch(IOException e)
        {
            System.out.println("Wrong file path. Please try again.");
        }
        finally
        {
            if(s != null)
            {
                s.close();
            }
        }
    }
}

