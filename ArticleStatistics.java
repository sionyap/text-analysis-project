import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap; // for creating a hashmap of word to frequency
import java.util.Scanner;

public class ArticleStatistics
{
    public ArticleStatistics()
    {
        HashMap <String, Integer> words = new HashMap <>();
    }

    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<>();
        Scanner s = null; // for file reading
        Scanner userInput = new Scanner(System.in); // for user input of path
        try
        {
            // "C:\Users\sionp\Documents\class\25-26\fall\cpsc\lab\topics\cpu_chips_topic\topic_1-2.txt"
            System.out.println("What is the path of your article file?");
            s = new Scanner(new BufferedReader(new FileReader(userInput.nextLine())));
            while(s.hasNextLine())
            {
                words.add(s.nextLine());
            }
            System.out.println("Article words: " + words);
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
