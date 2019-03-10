package com.tapakkur.bufferedReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author tapakkur
 * @ProjectName codePlay
 * @Date 2019/2/21 0:20
 */
public class Test {

    public static void main(String[] args) throws Exception{

        Scanner in = new Scanner(new FileInputStream(new File(
                "F:" + File.separator + "test.txt"
        ))); //这是jdk5之后最好的键盘输入了
        in.useDelimiter("\n"); // 设置分隔符
        while (in.hasNext()) {
            System.out.println(in.next());
        }
        in.close();
    }
}
