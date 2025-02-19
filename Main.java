import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";

    ArrayList<String> words = new ArrayList<String>();

    System.out.println("Please enter words, enter STOP tp stop the loop");
    while (!input.equals("STOP"))
    {
      System.out.println("In the loop, please enter word:");
      input = sc.nextLine();
      words.add(input);
      System.out.println("The ArrayList is now " + words);
    }
    System.out.println("Removing the last word");
    int lastIndex = words.size()-1;
    words.remove(lastIndex);

    System.out.println("Remove the last word. Arraylist is now " + words);

    String fristWord = words.get(0);
    words.set(words.size()-1, fristWord); //set is how you replace
  
    System.out.println("Replacing the last word with the frist word " + words);

    if (words.size() > 2)
    {
      words.remove(fristWord);
      System.out.println("Frist element has been removed " + words);
    }

  }
}
