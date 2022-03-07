import java.util.*;
import java.io.*;

class oddthread extends Thread{
    int n;
    oddthread(int n){
        this.n = n;
    }
    public void run(){
        for(int i = 0; i<n;i++){
            System.out.print("numbers : "+i);
        }
    }
}
public class thread {
    public static void main(String[] args) {
        oddthread od = new oddthread(10);
        od.start();
    }
}
