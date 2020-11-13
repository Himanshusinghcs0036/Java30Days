package com.himanshu.hackerrank;
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class Array2D {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] ar) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<4;i++){
            System.out.println(" i = "+i);
            int x=0;
            int pair1=getSum(i,x,ar);
            max=Math.max(max, pair1);
            x++;
            int pair2=getSum(i,x,ar);
            max=Math.max(max, pair2);
            x++;
            int pair3=getSum(i,x,ar);
            max=Math.max(max, pair3);
            x++;
            int pair4=getSum(i,x,ar);
            max=Math.max(max, pair4);

        }
        System.out.println(max);
        return max;
    }

    static int getSum(int row, int col,int [][] ar){
        System.out.println("===================== "+row+" "+col+" ==================");
        System.out.println(ar[row][col]+" "+ar[row][col+1]+" "+ar[row][col+2]);
        System.out.println("  "+ar[row+1][col+1]);
        System.out.println(ar[row+2][col]+" "+ar[row+2][col+1]+" "+ar[row+2][col+2]);
        System.out.println(" ");
        System.out.println(" ");
        int sum= ar[row][col]+ar[row][col+1]+ar[row][col+2]+ar[row+1][col+1]+ar[row+2][col]+ar[row+2][col+1]+ar[row+2][col+2];
        System.out.println("sum = "+sum);
        System.out.println(" ");
        System.out.println("=======================================");
        return sum;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];
        String input[]= {"-1 -1 0 -9 -2 -2","-2 -1 -6 -8 -2 -5","-1 -1 -1 -2 -3 -4","-1 -9 -2 -4 -4 -5","-7 -3 -3 -2 -9 -9","-1 -3 -1 -2 -4 -5"};
        for (int i = 0; i < 6; i++) {
            String s=input[i];
            System.out.println(s);
            String[] arrRowItems = s.split(" ");
           // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

       /* bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
}
