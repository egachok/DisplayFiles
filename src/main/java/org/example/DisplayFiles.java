package org.example;

import java.io.File;

public class DisplayFiles {
    public static void main(String[] args) {
        read("./");
    }

    public static void read (String path){
        File file = new File(path);
        for (File f : file.listFiles()) {
            if(f.getName().equals(".") || f.getName().equals("..")) continue;
            if (f.isDirectory()) {
                read(f.getPath());
            }
            if(!f.isDirectory() && f.getName().contains(".java")) System.out.println(f.getName());
        }
    }
}