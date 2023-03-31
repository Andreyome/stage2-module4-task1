package com.mjc.stage2;

public class ThreadSafeSingleton {
public static ThreadSafeSingleton instance = new ThreadSafeSingleton();
private ThreadSafeSingleton (){
}
public static ThreadSafeSingleton getInstance(){
    return instance;
}
}
