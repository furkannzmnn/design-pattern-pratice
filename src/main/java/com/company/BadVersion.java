package com.company;

import java.util.ArrayList;

public class BadVersion {

    public static int[] intersection(int[] num,int[] num2 ) {
        ArrayList<Integer> integers = new ArrayList<Integer>();

        int i , j;

        for (i = 0; i < num.length  ; i++) {
            for (j = 0; j<num2.length ; j++) {
                if (num[i] == num2[j]) {
                   integers.add(i);
                   break;
                }
            }
        }
        int a[]=new int[integers.size()];
        for(int aa=0;i<integers.size();i++)
        {
            a[aa]=integers.get(aa);
        }
        return a;

    }

    public static void builder(Integer value, Integer... key) {

    }

    public static void main(String[] args) {
        System.out.println("ok");
    }
}
