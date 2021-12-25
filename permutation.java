package com.company;

// Example for Permutations 
public class permutation {
    public static void main(String[] args) {
        perm("","abc");

    }
    public static void perm(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(unprocessed);
            return;

        }
        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        for (int i = 0; i <=processed.length() ; i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i);

            perm(first+ch+second,unprocessed);

        }
    }
}
