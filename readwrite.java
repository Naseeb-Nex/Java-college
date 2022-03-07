import java.util.*;
import java.io.*;

public class readwrite {
    public static void main(String[] args) {
        try{
            File f = new File("readwrite.txt");
            f.createNewFile();
            FileWriter fw = new FileWriter("readwrite.txt");
            fw.write("Halleo");
            fw.close();

            Scanner r = new Scanner(f);
            while(r.hasNextLine()){
                String data = r.nextLine();
                System.out.println(data);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
