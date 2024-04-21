import java.util.Scanner;
import java.util.ArrayList;
public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> numlist = new ArrayList<>();
    //System.out.print("Enter number of digits: ");
    int num = in.nextInt();
    for (int j = 0; j < num; j++) {
        //System.out.print("> ");
        int digit = in.nextInt();
        numlist.add(digit);
    }
    int mode = numlist.get(0);
    int previous = 1;
    int count = 1;
    for (int i = 1; i < num; i++) {
        if (numlist.get(i).equals(numlist.get(i - 1))) 
        {
            count++;
        } 
        else 
        {
            if (count> previous) 
            {
                previous = count;
                mode = numlist.get(i - 1);
            }
            count = 1;
        }
    }
    if (count > previous) 
    {
        mode = numlist.get(num - 1);
    }
    System.out.println(mode);
    in.close();    
  }
}
