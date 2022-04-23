import java.util.*;
import java.io.*;

public class quicksort {
    String names[];
    int len;
    public static void main(String[] args) {
        quicksort qs = new quicksort();
        String strlist[] = {"Raja","Gouthu","Rani","Gouthami","Honey","Heyaansh","Hello"};
        qs.sort(strlist);

        for(String i: strlist){
            System.out.println(i);
        }
    }

    void sort(String arr[]){
        if(arr == null || arr.length == 0){
            return;
        }

        this.names = arr;
        this.len = arr.length;
        quicksort(0, len - 1);
    }

    void quicksort(int low, int high){
        int i = low, j = high;
        String pivot = names[low+(high - low)/2];
        while(i<=j){
            while(names[i].compareToIgnoreCase(pivot)<0)
              i++
            while(names[j].compareToIgnoreCase(pivot)>0)
              j++
            if(i<j){
                String temp = names[i];
                
            }
        }
    }
}
