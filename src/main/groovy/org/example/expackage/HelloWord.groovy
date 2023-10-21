package org.example.expackage

import groovy.transform.PackageScope

import java.sql.DriverManager

class HelloWord {

    Integer value

//    @PackageScope
    static void main(String[] args) {
        String value = "Hello"
        Class<String> clazz = value.getClass()
        assert clazz == String.class
        println "Hello World"
        println clazz.getClassLoader()
        println DriverManager.class.getClassLoader()
        println HelloWord.class.getClassLoader()


        var boot = ModuleLayer.boot()
        boot.modules().forEach(module -> println(module.getClassLoader()))
//        + " : " + module.getName()
    }
}
