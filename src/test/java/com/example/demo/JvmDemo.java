package com.example.demo;


/**
* java栈溢出OutOfMemoryError
* JVM参数：-Xss2m
*/
public class JvmDemo {
  private void dontStop() {
    while (true) {
    }
  }
  //通过不断的创建新的线程使Stack内存耗尽
  public void stackLeakByThread() {
    while (true) {
      Thread thread = new Thread(() -> dontStop());
      thread.start();
    }
  }
  public static void main(String[] args) {
    JvmDemo oom = new JvmDemo();
    oom.stackLeakByThread();
  }
}