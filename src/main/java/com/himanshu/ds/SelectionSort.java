package com.himanshu.ds;

import java.util.Collections;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] ={1, 12, 5 ,111 ,200, 1000, 10};
        SelectionSort sort=new SelectionSort();
       // sort.sort(arr);
       // sort.printArray(arr);
        System.out.println(sort.sort(arr));;
    }

    public int sort(int[] array){
        int len=array.length;
        for(int i=0;i<len-1;i++){
            int minIndex=i;
            for(int j=i+1;j<len;j++){
                if(array[minIndex]>array[j]) {
                    System.out.println();
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                int tmp=array[minIndex];
                array[minIndex]=array[i];
                array[i]=tmp;
            }
        }

        printArray(array);
        int toyCount=0;
        int index=0;
        int nextPrice=0;
        int k=50;
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



    public void printArray(int[] array){
        for(int i=0;i<array.length-1;i++){
            System.out.println(array[i]+" ");
        }
    }

    public int solve(int[] A, int B) {
        int[] ar=new int[B*2];
        int cnt=0;
        for (int i=0; i<=B; i++){
            ar[cnt]=A[i];
            cnt++;
        }
        for (int i=A.length-1; i>A.length-B; i--){
            ar[cnt]=A[i];
            cnt++;
        }
        sort(ar);
        int finalVal=0;
        for(int j=0;j<B;j++){
            finalVal=finalVal+ar[j];
        }
        //System.out.println(start +" "+end);
        printArray(ar);
        return finalVal;
        /*if(start>end) return start;
        else return end;*/
    }
}
