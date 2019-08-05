package com.example.demo;

/**
 * @author gaojindan
 * @date 2019/6/28 13:31
 * @des
 */
public class SynchronizedDemo {
    public static void main(String[] args) {
        synchronized (SynchronizedDemo.class) {
        }
        method();
    }

    private static void method() {

    }
}
