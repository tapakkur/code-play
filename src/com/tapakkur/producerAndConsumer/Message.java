package com.tapakkur.producerAndConsumer;

/**
 * created by tapakkur on 2019/2/1
 */
public class Message {
    private String title;
    private String content;
    private boolean flag = true;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    /**
     * producer : set
     * flag = true : just can produce ,but cannot consume
     * flag = false: just can consume,but cannot produce
     * */
    public synchronized void set (String title, String content) {
        if (this.flag == false) { // 消费还未完成，等待消费完毕再生产
            try {
                super.wait(); // 线程会进入赌赛状态，直到被唤醒为止 ；
                // wait() 方法是Object类的静态方法，super 表示调用了父类构造方法
            } catch (InterruptedException e) { // 注意异常类型
                e.printStackTrace();
            }
        }
        // 开始设置属性值
        this.title = title;
        try {
            Thread.sleep(2000); // 睡眠2s ,会自动恢复
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = content;
        this.flag = false; // 本次生产结束，改变标志状态值
        super.notify(); // notify()方法也是Obj类的静态方法之一，这里起到唤醒恰前面的就绪状态的线程
    }

    /**
     * consumer ：get
     * flag = true : just can produce ,but cannot consume
     * flag = false: just can consume,but cannot produce
     * */

    public synchronized void get () {
        if (this.flag == true) { // 表示生产还未完成，需要继续等等
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("the title is " + this.title + ", the content is " + this.content);
        this.flag = true; // 本次消费完毕唤醒后可以开始生产了
        super.notify();
    }
}
