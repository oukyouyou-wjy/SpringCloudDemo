package com.example.feignclient.cache;

public class RequestHolder {
    public static final ThreadLocal<Integer> context = new InheritableThreadLocal<>();

    public static void clear() {
        context.set(null);
    }

    public static void setContext(Integer port) {
        context.set(port);
    }

    public static Integer getContext() {
        return context.get();
    }
}
