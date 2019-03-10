package com.tapakkur.io;

import java.io.*;

/**
 * created by tapakkur on 2019/2/4
 */
public class Sream {
    public static void  main (String args[]) throws Exception{
        File file = new File("f:" + File.separator + "test.txt");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
//        OutputStream output = new FileOutputStream(file);
        String str = "nice to meet you, hello world !";
        byte data[] = str.getBytes();
//        output.write(data);
        if (file.exists()) {
            InputStream input = new FileInputStream(file);
            byte data2 [] = new byte[1024];
            int len = input.read(data2);
            input.close();
            System.out.println(new String(data2, 0, len));
        }
            System.out.println("input has finished");
//        output.close();
    }
}
