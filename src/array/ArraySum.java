package array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class ArraySum {




        // Complete the hourglassSum function below.
        static int hourglassSum(int[][] arr) {
            int maxSum=Integer.MIN_VALUE;
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    int sum=0;
                    for(int k=0;k<3;k++){
                        for(int l=0;l<3;l++){
                            if(!((k==1)&&(l!=1)))
                                sum += arr[k+i][l+j];
                        }
                    }
                    if (sum>maxSum)
                        maxSum=sum;

                }
            }
            return maxSum;
        }

        private static final Scanner in = new Scanner(System.in);

        public static void main(String[] args)  {
            int[][] arr=new int[6][6];
            for(int i=0;i<6;i++)
                for(int j=0;j<6;j++)
                    arr[i][j]=in.nextInt();

            System.out.println(hourglassSum(arr));

        }


}
