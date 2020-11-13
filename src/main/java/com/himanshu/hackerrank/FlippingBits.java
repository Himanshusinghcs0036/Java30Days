package com.himanshu.hackerrank;



public class FlippingBits {

    public static void main(String[] args) {
        String s=Long.toBinaryString(2147483647);
        String pad="";
        for(int i=0;i<32-s.length();i++){
            pad=pad+"0";
        }
        String binaryString=pad+s;
        String flipped=flip(binaryString);
        System.out.println(Long.parseLong(flipped,2));

    }

    public static String flip(String s){
        char[] ch=s.toCharArray();
        for(int i =0 ;i<ch.length;i++){
            if(ch[i]=='0')
                ch[i]='1';
            else
                ch[i]='0';
        }
        return new String(ch);
    }
}
