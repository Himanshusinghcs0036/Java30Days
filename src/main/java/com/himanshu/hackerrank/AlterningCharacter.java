package com.himanshu.hackerrank;

public class AlterningCharacter {

    static int alternatingCharacters(String s) {

        int deleteCount=0;
        char[] chars=s.toCharArray();
        for(int i =0;i<chars.length-1;i++){
            if(chars[i]==chars[i+1]) deleteCount++;
        }
        return deleteCount;
    }

}
