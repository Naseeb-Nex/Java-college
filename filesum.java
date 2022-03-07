import java.util.*;
import java.io.*;

public class filesum {
    public static void main(String[] args) {
        try{
            File f = new File("sum.txt");
            f.createNewFile();
            FileWriter fw = new FileWriter("sum.txt");
            fw.write("11 12 13");
            fw.close();

            Scanner r = new Scanner(f);
            int sum = 0;
            while(r.hasNextLine()){
                String num = r.nextLine();
                StringTokenizer st = new StringTokenizer(num);
                while(st.hasMoreTokens()){
                    int n = Integer.parseInt(st.nextToken());
                    sum = sum + n;
                }
            }

            System.out.println("The Sum is : "+sum);

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
