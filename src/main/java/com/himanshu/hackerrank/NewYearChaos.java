package com.himanshu.hackerrank;

/*
 * UN-SOLVED .. Time Complexity
 * */

/*
* Solution For : https://www.hackerrank.com/challenges/new-year-chaos/problem
* */

public class NewYearChaos {

    static void minimumBribesFromDiscussion(int[] q) {
        int bribeCount=0;
        boolean isChaos=false;
        int expectedFirst = 1;
        int expectedSecond = 2;
        int expectedThird = 3;
        for(int i=0;i<q.length;i++){
            if (q[i] == expectedFirst) {
                expectedFirst = expectedSecond;
                expectedSecond = expectedThird;
                ++expectedThird;
            } else if (q[i] == expectedSecond) {
                ++bribeCount;
                expectedSecond = expectedThird;
                ++expectedThird;
            } else if (q[i] == expectedThird) {
                bribeCount += 2;
                ++expectedThird;
            }else {
                System.out.println("Too chaotic");
                break;
            }
        }
        if(isChaos) System.out.println("Too chaotic");
        else System.out.println(bribeCount);
    }

    static void minimumBribes(int[] q) {
        int bribeCount=0;
        boolean isChaos=false;
        for(int i=1;i<=q.length;i++){
            if(q[i-1]-i>2) {
                isChaos =true;
                break;
            }
            if(q[i-1]-i<=-3) bribeCount+=1;
            if(q[i-1]-i<=0) continue;
            bribeCount+=q[i-1]-i;
        }
        if(isChaos) System.out.println("Too chaotic");
        else System.out.println(bribeCount);
    }


    public static void main(String[] args) {
        String[] s="1 2 5 3 7 8 6 4".split(" ");
        int ar[]= new int[s.length];
        for(int i=1;i<s.length;i++){
            ar[i]=Integer.parseInt(s[i]);
        }
        minimumBribes(ar);
    }
}
