package com.tapakkur.cumputer;

/**
 * created by tapakkur on 2019/1/28
 */
public class Test {

    public static void main (String rags[]) {

        Computer computer = new Computer();
        Flash flash = new Flash();
        Print printer = new Print();
        computer.operation(flash);
        computer.operation(printer);
    }
}
