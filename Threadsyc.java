import java.util.*;
import java.lang.*;

class Display {
    public synchronized void print(){
        try{
        System.out.println("Yedhu");
        Thread.sleep(1000);
        System.out.println("is good boy");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

class threadclass extends Thread{
    Display d;
    threadclass(Display dis){
        this.d = dis;
    }
    public void run(){
        this.d.print();
    }
}

public class Threadsyc {
    public static void main(String[] args) {
        Display d = new Display();
        threadclass e =new threadclass(d); 
        threadclass f =new threadclass(d);
        e.start();
        f.start(); 
    }
}
