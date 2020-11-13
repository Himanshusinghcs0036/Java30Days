package com.himanshu.hackerrank;

/*
Solution For : https://www.hackerrank.com/challenges/mark-and-toys/problem
 */

/*
* UN-SOLVED .. Time Complexity
* */

public class MarkAndToys {

    static int maximumToys(int[] array, int k) {
        int len=array.length;
        for(int i=0;i<len-1;i++){
            int minIndex=i;
            for(int j=i+1;j<len;j++){
                if(array[minIndex]>array[j]) {
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                int tmp=array[minIndex];
                array[minIndex]=array[i];
                array[i]=tmp;
            }
        }
        int toyCount=0;
        int index=0;
        int nextPrice=0;
        while(index<array.length-1 && k>nextPrice){
            toyCount++;
            k=k-array[index];
            index++;
            if(index<array.length-1){
                nextPrice=array[index];
            }
        }
        return toyCount;
    }

}
