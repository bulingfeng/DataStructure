package com.datastructure.test;

import com.datastructure.linkedlist.NewLinkedList;
import com.datastructure.quque.CircleQueue;

/**
 * @Package: com.datastructure.test
 * @ClassName: Main
 * @Description: 类描述
 * @Author: bulingfeng
 * @CreateDate: 2019/4/9/009 11:08
 */
public class Main {
    public static void main(String[] args) throws Exception {
//        NewLinkedList<String> newLinkedList=new NewLinkedList();
//        newLinkedList.add("1");
//        newLinkedList.add("2");
//        newLinkedList.add("3");
//        newLinkedList.remove(2);
//        System.out.println(newLinkedList.get(1));

        CircleQueue<String> circleQueue=new CircleQueue<>();
//        circleQueue.add("1");
//        circleQueue.add("2");
//        circleQueue.add("3");

        for (int i=0;i<101;i++){
            circleQueue.add(i+"");
        }
        System.out.println(1);
    }
}
