package com.tapakkur.test003;

/**
 * created by tapakkur on 2019/1/26
 */
public class Link {
//    定义一个内部类
    private class Node {
       private Book book; // 保存数据
       private Node next; // 指向下一节点

        // 无参数构造函数
        public Node () {}
        // 带参数构造函数
        public Node (Book book) {
            this.book = book;
        }

        // getter， setter方法
        public Book getBook() {
            return book;
        }

        public void setBook(Book book) {
            this.book = book;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        // 添加新节点
        public void addNode (Node newNode) {
            if (this.next == null) {
                this.next = newNode;
            } else {
                this.next.addNode(newNode); // 当前节点后的节点继续调用本方法
            }
        }

        // 数据检索
        public boolean contains (Book book) {
            if (this.book.compare(book)) {
                return true;
            } else {
                if (this.next != null) {
                    return this.next.contains(book);
                } else {
                    return false;
                }
            }
        }

        // 获取节点
        public Book getNode(int index) {
            if (Link.this.index++ == index) {
                return this.book; // 返回当前节点的数据
            } else {
                return this.next.getNode(index); // 继续查询
            }
        }

        // 修改指定索引节点的数据
        public void setNode (int index, Book book) {
            if (Link.this.index == index) {
                this.book = book;
            } else {
                this.next.setNode(index, book);
            }
        }

        // 删除当前节点
        public void deleteNode (Node previous, Book book) {
            if (book.compare(this.book)) { // 当前节点是要删除的节点
                previous.next = this.next; // this是当前节点，剔除当前节点
            } else {
                if (this.next != null) {
                    this.next.deleteNode(this, book); // 注意之前的previous节点是root节点，现在调到root的下一个节点
                }
            }
        }

        // 将链表转换成数组后保存
        public void toArrayNode () {
            Link.this.array[Link.this.index++] = this.book; // 将当前节点的数据赋给index为索引的数组
            if (this.next != null) {
                this.next.toArrayNode(); // 继续转化
            }
        }
    }

    /**
     * 以上为内部类内容
     * */

    private Node root; // 跟节点
    private int count = 0; // 数量size
    private int index = 0; // 索引
    private Book array[]; // 存放将链表转换成数组的数据

    // 添加节点
    public void add (Book book) {
        if (book == null) {
            return; // 如果节点为空，则结束添加节点
        }
        Node newNode = new Node(book); // 将book封装为一个节点
        if (this.root == null) {
            this.root = newNode;
        } else {
            /**
             *  // Node内部类中实现的方法是当前节点存在的情况下，
             *  而这里已经判断是否有root节点，既然现在已经有节点了，那就交给addNode好了
             * */
            this.root.addNode(newNode);
        }
        this.count++;
    }

    // 获取链表的长度
    public int size () {
        return this.count;
    }

    // 判断是否空链表
    public boolean isEmpty () {
        return this.count == 0; // 长度是否为  0？。为零则空，否则不为空
    }

    // 根据index获取已保存的节点数据
    public Book get (int index) {
        if (index > this.index) {
            return null; // 节点数据为null，即没有数据的节点
        }
        this.index = 0;
        return this.root.getNode(index);
    }

    // 根据index修改节点数据
    public void set (int index, Book book) {
        if (index > this.index) return;
        this.index = 0;
        this.root.setNode(index, book);
    }

    // 查询是否包含数据
    public boolean contains (Book book) {
        if (book == null || this.root == null) return false;
        return this.root.contains(book);
    }

    // 删除节点:如果删除的节点是跟节点，则由Link的方法来加以校验处理，若不是则由Node的方法来处理
    public void delete (Book book) {
        if (this.contains(book)) {
            if (book.equals(this.root.book)) {
                this.root = this.root.next; // 剔除当前的跟节点，将后面的节点作为新的根节点
            } else { // 由于不是跟节点，因此交给Node来处理了
                this.root.next.deleteNode(this.root, book);
            }
        }
        this.count--;
    }

    // 链表转化为数组
    public Book[] toArr () {
        if (this.root == null) return null;
        this.index = 0;
        this.array = new Book[this.count]; // 开辟数组
        this.root.toArrayNode();
        return this.array;
    }

    // 清空
    public void clear () {
        this.count = 0;
        this.root = null;
    }

}
