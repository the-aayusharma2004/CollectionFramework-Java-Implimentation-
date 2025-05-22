package ArraysArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
    //Jagged Array :array with variable no of col
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[][] =new int[n][];
        for(int i=0;i<n;i++)
        {
            System.out.println("cols in "+(i+1)+"row");
            int currCol=sc.nextInt();
            arr[i]=new int[currCol];
            System.out.println("Data");
            for(int j=0;j<currCol;j++)
            {
                 arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));

    }
}
