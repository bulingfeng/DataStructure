package com.datastructure.linkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * @Package: com.datastructure.linkedlist
 * @ClassName: MergeTwoSortLinkList
 * @Description: merge two linkedlist
 * @Author: bulingfeng
 * @CreateDate: 2019/4/8/008 17:16
 */
public class MergeTwoSortLinkList {
    public static void main(String[] args) {
        List<Integer> list1=new LinkedList<Integer>();
        List<Integer> list2=new LinkedList<Integer>();
        /**
         * linklist inite data
         */
        list1.add(1);
        list1.add(2);
        list1.add(4);

        list2.add(1);
        list2.add(3);
        list2.add(4);

        List<Integer> finalList=merging(list1,list2);
        for (Integer i:finalList){
            System.out.println(i);
        }
    }
    protected static List merging(List<Integer> list1,List<Integer> list2){
        if (list1==null||list1.size()==0){
            return list2;
        }
        if (list2==null||list2.size()==0){
            return list1;
        }
        List<Integer> finalList=new LinkedList();

        int num1=0;
        int num2=0;
        while (list1.size()>num1&&list2.size()>num2){
            if (list1.get(num1)>=list2.get(num2)){
                finalList.add(list2.get(num2));
                num2++;
            }else {
                finalList.add(list1.get(num1));
                num1++;
            }
        }
        //if some linkedlist have items,so add to finallist
        if (num1<list1.size()){
            finalList.add(list1.get(num1));
            num1++;
        }

        if (num2<list2.size()){
            finalList.add(list2.get(num2));
            num2++;
        }
        return finalList;
    }
}
