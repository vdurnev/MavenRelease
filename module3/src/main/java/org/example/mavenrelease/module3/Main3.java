package org.example.mavenrelease.module3;

import org.example.mavenrelease.module2.Main2;

public class Main3 {
    public String title = "Module 3";
    public static void main(String[] args) {
        System.out.println("Hello, World! - Module3");
        System.out.println("Depends on " + Main2.title);
    }
}
