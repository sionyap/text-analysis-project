import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class TextAnalysis // main class
{
    private String article1;
    private String article2;
    private String article3;

    public TextAnalysis(String article1, String article2, String article3)
    {
        this.article1 = article1;
        this.article2 = article2;
        this.article3 = article3;
    }

    public static void main(String[] args) throws Exception // main method
    {
        TextAnalysis a1 = new TextAnalysis("article 1", "article 2", "article 3");

        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            // reading the entire article without loops

            System.out.print("Enter path of article: ");

            // read filename
            String path = reader.readLine();
            File file = new File(path);
            Scanner scan2 = new Scanner(file);

            scan2.useDelimiter("\\Z");

            System.out.println(scan2.next());
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found. Please try again.");
        }
        catch(IOException e)
        {
            System.out.println("Wrong file path. Please try again.");
        }

    }

    public static boolean menu(int option)
    {
        // TODO : case switch; recall java case switch syntax
        return true;
    }

}
