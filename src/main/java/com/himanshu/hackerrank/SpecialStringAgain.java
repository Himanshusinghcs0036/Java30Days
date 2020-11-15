package com.himanshu.hackerrank;


/*
* Work In Progress
* */

public class SpecialStringAgain {

    static long substrCount(int n, String s) {
        long len = s.length();
        int repeat=0;
        int ans=s.length();
        for(int i =0; i<s.length()-1 ; i++){
            while(i<s.length()-1 && s.charAt(i+1)==s.charAt(i)  ){
                i++;
                repeat++;
            }
            ans+=(repeat*(repeat+1))/2;


            int secondPont=1;
            while(i-secondPont>=0 && i+secondPont< s.length() &&
                    s.charAt(i+secondPont)==s.charAt(i-1) && s.charAt(i-secondPont)==s.charAt(i-1)){
                ans++;
                secondPont++;
            }
        }

        System.out.println(Integer.MAX_VALUE);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(substrCount(5,"ccacacabccacabaaaabbcbccbabcbbcaccabaababcbcacabcabacbbbccccabcbcabbaaaaabacbcbbbcababaabcbbaaababababbabcaabcaacacbbaccbbabbcbbcbacbacabaaaaccacbaabccabbacabaabaaaabbccbaaaabacabcacbbabbacbcbccbbbaaabaaacaabacccaacbcccaacbbcaabcbbccbccacbbcbcaaabbaababacccbacacbcbcbbccaacbbacbcbaaaacaccbcaaacbbcbbabaaacbaccaccbbabbcccbcbcbcbcabbccbacccbacabcaacbcaccabbacbbccccaabbacccaacbbbacbccbcaaaaaabaacaaabccbbcccaacbacbccaaacaacaaaacbbaaccacbcbaaaccaabcbccacaaccccacaacbcacccbcababcabacaabbcacccbacbbaaaccabbabaaccabbcbbcaabbcabaacabacbcabbaaabccabcacbcbabcbccbabcabbbcbacaaacaabbbabbaacbbacaccccabbabcbcabababbcbaaacbaacbacacbabbcacccbccbbbcbcabcabbbcaabbaccccabaabbcbcccabaacccccaaacbbbcbcacacbabaccccbcbabacaaaabcccaaccacbcbbcccaacccbbcaaaccccaabacabcabbccaababbcabccbcaccccbaaabbbcbabaccacaabcabcbacaccbaccbbaabccbbbccaccabccbabbbccbaabcaabcabcbbabccbaaccabaacbbaaaabcbcabaacacbcaabbaaabaaccacbaacababcbacbaacacccacaacbacbbaacbcbbbabccbababcbcccbccbcacccbababbcacaaaaacbabcabcacaccabaabcaaaacacbccccaaccbcbccaccacbcaaaba"));
    }

}
