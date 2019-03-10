package com.tapakkur.factory;

/**
 * @author tapakkur
 * @ProjectName codePlay
 * @Date 2019/2/19 11:19
 */

interface USB {
    public void start();
    public void stop();
}

class Printer implements USB {
    @Override
    public void start() {
        System.out.println("start the printer");
    }

    @Override
    public void stop() {
        System.out.println("stop the printer");
    }
}

class Flush implements USB {
    @Override
    public void start() {
        System.out.println("start the flush");
    }

    @Override
    public void stop() {
        System.out.println("stop the flush");
    }
}

class Factory {
    public static USB getInstance (String className) {
        if ("flush".equals(className)) {
            return new Flush();
        } else if ("printer".equals(className)) {
            return new Printer();
        } else {
            return null;
        }
    }

    public static USB getFlush () {
        return new Flush();
    }

    public static USB getPrinter () {
        return new Printer();
    }
}
public class Main1 {

    public static void main(String[] args) {
        USB usb = Factory.getInstance("flush");
        usb.start();
        usb.stop();

        USB usb1 = Factory.getFlush();
        usb1.start();
        usb1.stop();
    }
}
