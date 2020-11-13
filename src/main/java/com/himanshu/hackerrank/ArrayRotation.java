package com.himanshu.hackerrank;

public class ArrayRotation {

    static int[] rotLeft(int[] a, int d) {
        while(d>0){
            d--;
            int lastElem=a[0];
            for(int i=0;i<a.length-2;i++){
                a[i]=a[i+1];
            }
            a[a.length-2]=a[a.length-1];
            a[a.length-1]=lastElem;
        }

        return a;
    }

    public static void main(String[] args) {
        int a[] ={3,4,5,6,1,2};
        printArray(rotLeft1(a,2));
    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length-1;i++){
            System.out.println(array[i]+" - ");
        }
    }

    static int[] rotLeft1(int[] a, int d) {
        int []b=a.clone();
            for(int i=0;i<a.length-1;i++){
                System.out.println((i+d)%a.length);
                b[i]=a[(i+d)%a.length];
            }
        return b;
    }
}
