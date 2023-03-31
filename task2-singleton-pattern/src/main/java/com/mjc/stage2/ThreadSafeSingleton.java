package com.mjc.stage2;

public class ThreadSafeSingleton {
public static volatile ThreadSafeSingleton instance = new ThreadSafeSingleton();
private ThreadSafeSingleton (){
}
public static synchronized ThreadSafeSingleton getInstance(){
if (instance == null){
    instance = new ThreadSafeSingleton();
}
    return instance;
}
}
