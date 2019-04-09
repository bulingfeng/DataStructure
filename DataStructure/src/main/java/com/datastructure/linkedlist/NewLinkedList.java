package com.datastructure.linkedlist;

/**
 * @Package: com.datastructure.linkedlist
 * @ClassName: NewLinkedList
 * @Description: 类描述
 * @Author: bulingfeng
 * @CreateDate: 2019/4/9/009 10:41
 */
public class NewLinkedList<E> {
    private Node first;
    private Node last;
    private int size;
    private class Node{
        private E data;
        private Node next;

        public Node() {
        }

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    //add
    public boolean add(E value){
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
    //get element by index
    public E get(int index) throws Exception {
        if (index>=size)
            throw new Exception("index不符合要求");
        Node temp=first;
        if (index==0){
            return temp.data;
        }else {
            int num=0;
            while (temp!=null&&temp.next!=null){
                temp=temp.next;
                if (index==(++num)){
                    return temp.data;
                }
            }
        }
        return null;
    }

    //remove some element of index
    public boolean remove(int index) throws Exception {
        if (index>=size)
            throw new Exception("index 不符合要求");

        if (index==0){
            if (first.next==null){
                first=null;
                last=null;
            }else {
                first=first.next;
            }
        }else {
            Node pre=first;
            Node curent=pre.next;
            Node after=curent.next;
            int num=1;
            while (curent!=null){
                if (num==index){
                     pre.next=after;
                     return true;
                }
                pre=pre.next;
                curent=curent.next;
                after=after.next;
                num++;
            }
        }
        return true;
    }
    //test
    public void test(){
        System.out.println("test");
    }
}
