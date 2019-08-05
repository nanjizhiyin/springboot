package com.example.demo;

/**
 * @author gaojindan
 * @date 2019/8/5 10:21
 * @des
 */
public class Outer {

    public static void main(String[] args) {
        int tmpINT = 9;
        int tmpLen = 10;
        out1: for (int i = 0; i < tmpLen; i++){
            System.out.print("i = " + i);
            if (i == tmpINT){
                tmpINT = 100;
                tmpLen = 20;
                continue out1;
            }
        }
    }

}
