import java.util.Scanner;
import java.util.*;


public class stingrev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        int len = str.length() - 1;
        String rev = "";
        int j = 0;
        for(int i=len; i>=0; i--){
            rev = rev +  str.charAt(i);
        }
        System.out.print(rev);
    }    
}
