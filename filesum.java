import java.io.*;
import java.util.*;

public class filesum {

  public static void main(String[] args) {
    try {
      File f = new File("sum.txt");
      f.createNewFile();
      FileWriter fw = new FileWriter("sum.txt");
      fw.write("11 12 13");
      fw.close();

      int sum = 0;
      Scanner sc = new Scanner(f);
      while (sc.hasNextLine()) {
        String num = sc.nextLine();
        StringTokenizer st = new StringTokenizer(num);
        while (st.hasMoreTokens()) {
          int n = Integer.parseInt(st.nextToken());
          sum = sum + n;
        }
      }
      System.out.println("The Sum is : " + sum);
      
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
