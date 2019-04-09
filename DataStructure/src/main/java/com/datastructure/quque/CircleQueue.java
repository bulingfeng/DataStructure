package com.datastructure.quque;

import java.util.ArrayList;
import java.util.List;

/**
 * @Package: com.datastructure.quque
 * @ClassName: CircleQueue
 * @Description: 循环队列，用head和tail两个指针来减少list的数据移动
 * @Author: bulingfeng
 * @CreateDate: 2019/4/9/009 13:20
 */
public class CircleQueue<E> {
    int head;
    int tail;
    private List quque;
    int capacity;
    int size;
    public CircleQueue() {
        this.capacity=100;
        quque=new ArrayList(100);//默认是100
    }

    public CircleQueue(int capacity) {
        this.capacity=capacity;
        quque=new ArrayList(capacity);
    }
    //only check tail's next node is null
    public boolean isFull(){
        if (quque.size()!=capacity)
            return false;
        else
        return true;
    }

    public boolean add(E value){
        if (value==null)
            throw new NullPointerException();
        if (!isFull()){
            if (tail>=(capacity))
                tail=tail-capacity;
            quque.add(tail,value);
            tail++;
        }
        tail--;
        return true;
    }

}
