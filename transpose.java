import java.util.*;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Row : ");
        int r = sc.nextInt();
        System.out.println("Enter the size of Column : ");
        int c = sc.nextInt();

        int a[][] = new int[r][c];
        int b[][] = new int[c][r];

        System.out.println("Enter the Matix : ");
        for(int i = 0; i<r; i++){
            for(int j=0; j<c; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is ");
        for(int i = 0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println("");
        }
        for(int i = 0; i<r; i++){
            for(int j=0; j<c; j++){
                b[j][i] = a[i][j];
            }
        }
        
        System.out.println("Transpose Matrix is ");
        for(int i = 0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(b[i][j]+"  ");
            }
            System.out.println("");
        }
    }    
}
