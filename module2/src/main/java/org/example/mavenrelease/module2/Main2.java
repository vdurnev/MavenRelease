package org.example.mavenrelease.module2;

import org.example.mavenrelease.module1.Main1;

public class Main2 {
    public static String title = "Module 2";
    public static void main(String[] args) {
        System.out.println("Hello, World! - Module");
        System.out.println("Depends on " + Main1.title);
    }
}
