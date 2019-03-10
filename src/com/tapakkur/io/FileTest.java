package com.tapakkur.io;

import java.io.File;
import java.io.IOException;

/**
 * created by tapakkur on 2019/2/4
 */
public class FileTest {
    public static void main (String args[]) throws IOException {
        File file = new File("F:\\test.txt"); // 指定文件的路径
        if (file.exists()) {
            file.delete();
        } else {
            System.out.println("created new file : " + file.createNewFile());
//            System.out.println(file.createNewFile());
        }
    }
}
