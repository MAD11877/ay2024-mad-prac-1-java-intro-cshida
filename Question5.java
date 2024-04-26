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
      int times = in.nextInt();
      List<Integer> list = new ArrayList<Integer>();
      Map<Integer, Integer> map = new HashMap<Integer, Integer>();

      for (int i = 0; i < times; i++) {
          int number = in.nextInt();
          list.add(number);
          if (map.containsKey(number)) {
              int value = map.get(number);
              map.put(number, value + 1);
          } else {
              map.put(number, 1);
          }
      }

      int maxCount = 0;
      int mode = 0;
      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
          int count = entry.getValue();
          if (count > maxCount) {
              maxCount = count;
              mode = entry.getKey();
          }
      }

      System.out.println(mode);  
  }
}
