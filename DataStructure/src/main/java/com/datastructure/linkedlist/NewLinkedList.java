package com.datastructure.linkedlist;

/**
 * @Package: com.datastructure.linkedlist
 * @ClassName: NewLinkedList
 * @Description: 类描述
 * @Author: bulingfeng
 * @CreateDate: 2019/4/9/009 10:41
 */
public class NewLinkedList {
    private Node first;
    private Node last;
    private int size;
    private class Node{
        private Object data;
        private Node next;

        public Node() {
        }

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    //add
    public boolean add(Object value){
        if (first==null){
            Node node=new Node(value,null);
            first=node;
            last=node;
        }else {
            Node node=new Node(value,null);
            last.next=node;
            last=node;
        }
        size++;
    return true;
    }
    //test
    public void test(){
        System.out.println("test");
    }
}
