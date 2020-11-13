package com.himanshu.ds;

import java.util.HashMap;

public class BubbleSort {

    public static void main(String[] args) {

        int array[] = {14,33,27,35,10};

        for(int i=0;i<array.length-1;i++){
            boolean b=false;
            for (int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                    b=true;
                }
            }
            if(!b){
                break;
            }
        }
        for(int i=0;i<array.length-1;i++){
            System.out.println(array[i]);
        }





    }

    public void sortManual(int []ar){

        int tempHolder=0;
        for(int i=0; i<ar.length-1;i++){
            for(int j=1; j< ar.length-1-i;j ++){
                if(ar[j]>ar[j+1]){
                    tempHolder=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=tempHolder;
                }

            }
        }

    }



}
