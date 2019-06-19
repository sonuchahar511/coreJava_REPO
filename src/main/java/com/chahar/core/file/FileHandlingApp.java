package com.chahar.core.file;

import java.io.File;

public class FileHandlingApp {
    public static void main(String[] args){
        File file = new File("C:\\Users\\yschahar\\Desktop\\hmc.xml");

        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
    }
}

