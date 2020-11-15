package com.himanshu.hackerrank;

import java.util.*;

public class Anagram {

    static int makeAnagram(String a, String b) {
       char[] aCharArray = a.toCharArray();
       char[] bCharArray = b.toCharArray();
       int charToDelete = 0;

        Map<Character, Integer> aMap = new HashMap<Character, Integer>();

        for(char i: aCharArray){
            if(aMap.containsKey(i)) aMap.put(i, aMap.get(i)+1);
            else aMap.put(i, 1);
        }

        List<String> characterList= new ArrayList<String>();
        for(char i: bCharArray){
            if(! aMap.containsKey(i)) {
                characterList.add(i+" Not Present IN A");
                charToDelete++;
            }
            else if(aMap.get(i)>0) {
                aMap.put(i, aMap.get(i)-1);
            }
            else {
                characterList.add(i+" COUNT DOES NOT MATCH IN A");
                charToDelete++;
            }
        }

        for(Map.Entry<Character,Integer> i : aMap.entrySet()){
            if(i.getValue()>0) {
                characterList.add(i+" NOT PRESENT IN B");
                charToDelete+=i.getValue();
            }
        }

      /* for( String s: characterList){
           System.out.println(s);
       }*/

        return charToDelete;
    }

    public static void main(String[] args) {
        System.out.println(makeAnagram("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
    }
}
