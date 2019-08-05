package com.example.demo;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

/**
 * java方法区溢出OutOfMemoryError（JVM参数适用于JDK1.6之前，借助CGLIB）
 * JVM参数：-XX:PermSize=10M -XX:MaxPermSize=10M
 */

public class JavaMethodAreaOOM {
    public static void main(String[] args) {
        while (true) {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(OOMObject.class);
            enhancer.setUseCache(false);
            enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> methodProxy.invokeSuper(objects, args));
            enhancer.create();
        }
    }
    static class OOMObject {

    }

}