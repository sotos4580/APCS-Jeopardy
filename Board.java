import java.util.Scanner; 
import java.io.*;
import java.util.ArrayList;

public class Board
{
   
    private ArrayList<Question> myBoard;
    
    private String question, answer;
    private String[] choices = new String[4];
    private int dollarAmount;
    
    
    /**
     * Constructor for objects of class Jeopardy
     */
    public Board()
    {
        myBoard = new ArrayList<Question>();
    }

    public void inputCategories() throws IOException, FileNotFoundException
    {
        Scanner inF = new Scanner(new File("questions.txt"));
        while (inF.hasNextLine())
        {
            question = inF.nextLine();
            for (int i = 0; i < 4; i++)
                choices[i] = inF.nextLine();
            answer = inF.nextLine();
            dollarAmount = inF.nextInt();
            inF.nextLine();
        }
        
    }
}
