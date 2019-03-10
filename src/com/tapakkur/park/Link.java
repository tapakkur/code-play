package com.tapakkur.park;

/**
 * created by tapakkur on 2019/1/29
 * Link方法 是给用户操纵链表数据的
 * Node方法 是在类内操纵节点关系的
 */
public class Link {
    // ---------------------------- 内部类开始 ---------------------
    private class Node {
        private Object data;
        private Node next;

        public Node (Object data) {
            this.data = data;
        }

        // 添加节点
        public void addNode (Node newNode) {
            if (this.next == null) {
                this.next = newNode;
            } else {
                this.next.addNode(newNode);
            }
        }

        // 模糊查询
        public boolean containsNode (Object data) {
            if (data.equals(this.data)) { // 注意这里的equals方法在定义类时需要覆写
                return true;
            } else {
                if (this.next != null) {
                    return this.next.containsNode(data);
                } else {
                    return false;
                }
            }
        }

        // 根据index查询
        public Object getNode (int index) {
            if (Link.this.index++ == index) { // 这里访问外部类的属性index
                return this.data; // 返回当前Node类的对象数据
            } else {
                return this.next.getNode(index);
            }
        }

        /**
         * 修改指定位置上的节点
         * @param index 指定位置，如果该节点在链表里存在，则新数值赋给当前节点数据,否则继续迭代
         * @param data 新数值
         * */
        public void setNode (int index, Object data) {
            if (Link.this.index++ == index) {
                this.data = data;
            } else {
                this.next.setNode(index, data);
            }
        }

        /**
         * 删除节点
         * @param previous 当前节点前面的节点（当前节点不是跟节点的时候）
         * @param data 要删除的数据，如果当前节点的数据跟输入的数据相同，
         *             则将当前节点后面的节点赋给previous节点的next
         * */
        public void removeNode (Node previous, Object data) {
            if (data.equals(this.data)) { // 当有集体data时，记得在它类里面覆写它的equals方法
                previous.next = this.next; // 剔除当前节点了
            } else {
                this.next.removeNode(this, data);
            }
        }

        /**
         *  将链表转换成数组
         *  将当前链表对象的数据保存在Link的数组里，
         *  如果当前节点的后面还有节点，则继续迭代循环执行次操作
         * */
        public void toArrayNode () {
            Link.this.array[Link.this.index++] = this.data;
            if (this.next != null) {
                this.next.toArrayNode();
            }
        }
    }

    // ---------------------------- 内部类结束 ---------------------

    private Node root; // 跟节点
    private int index = 0; // 链表索引
    private int count = 0; // 链表的数据数量，即用来求 size
    private Object array[]; // 存放链表转换成数组后链表里的data

    /**
     * 添加
     * */
    public void add (Object data) {
        if (data == null) {
            return;
        }
        // 将数据data封装为节点
        Node newNode = new Node(data);
        if (this.root == null) {
            this.root = newNode;
        } else {
            // 由于addNode方法里判断是从当前节点next是否等于null开始，
            // 因此这里是当前跟节点调用addNode方法
            this.root.addNode(newNode);
        }
        this.count++;
    }

    // 获取链表size
    public int getSize () {
        return this.count;
    }

    // 判断是否为空链表
    public boolean isEmpty () {
        return this.count == 0;
    }

    // 模糊查询
    public boolean contains (Object data) {
        if (data == null || this.root == null) return false;
        return this.root.containsNode(data);
    }

    // set
    public void set (int index, Object data) {
        if (index > this.count) return;
        this.index = 0;
        this.root.setNode(index, data);
    }

    // get
    public Object get (int index) {
        if (index > this.count) return null;
        this.index = 0;
        return this.root.getNode(index);
    }

    // remove
    public void remove (Object data) {
        if (this.contains(data)) { // 如果包含该数据
            if (data.equals(this.root.data)) { // 如果要删除的是跟节点
                this.root = this.root.next; // 当前跟节点被其下一个节点代替了，即剔除跟节点了
            } else {
                if (this.root.next != null) {
                    this.root.next.removeNode(this.root, data);
                }
            }
        }
        this.count--;
    }

    // toArray 如果转换成功，则返回一个数组
    public Object[] toArray () {
        if (this.root == null) return null; // 先判断链表是否有数据
        this.index = 0;
        this.array = new Object[this.count]; // 开辟一个数组来保存当前链表里的所有数据
        this.root.toArrayNode(); // 执行次方法后链表里的数据都保存到Link里的array数组里了
        return this.array;
    }

    // clear
    public void clear () {
        this.count = 0;
        this.index = 0;
        this.root = null;
    }
}
