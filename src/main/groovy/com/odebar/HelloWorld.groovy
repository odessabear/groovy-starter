package com.odebar

import java.sql.DriverManager

class HelloWorld {
    static void main(String[] args) {
        String value = "Hello World"
        Class<String> clazz = value.getClass()
        assert clazz == String.class
        println("Hello World")
        println(clazz.getClassLoader())
        println(DriverManager.class.getClassLoader())
        println(HelloWorld.class.getClassLoader())
    }
}
