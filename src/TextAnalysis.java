import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

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
            Scanner scan = new Scanner(file);

            scan.useDelimiter("\\Z");

            System.out.println(scan.next());
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found. Please try again.");
            e.printStackTrace();
        }



    }

    public static boolean menu(int option)
    {
        // TODO : case switch; recall java case switch syntax
        return true;
    }

}
