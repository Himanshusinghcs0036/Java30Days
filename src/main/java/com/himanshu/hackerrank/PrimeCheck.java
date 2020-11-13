package com.himanshu.hackerrank;

public class PrimeCheck {

    static String primality(int n) {
        int a[]={2,3,5,7,9};
        String s="Prime";
        for(int i=2; i*i< n ;i++ ){
            if(n%i==0 && i!=n) {
                s="Not prime";
                break;
            }
        }
        return s;

    }

    public static void main(String[] args) {
        System.out.println(primality(1000000007));
    }
}
