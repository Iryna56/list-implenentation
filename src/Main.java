import LinkedList.MyLinkedList;
import LinkedList.Node;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        // arrayList

        // основа - лежит массив
        // когда массив переполняется, создаем массив в 1.5 раза больше
        // начальный размер массива - 10
        // все элементы имеют индексы

        ArrayList<Integer> arrayList = new ArrayList<>();

        ArrayList<Integer> resultList = new ArrayList<>();
//        MyArrayList a = new MyArrayList();
        arrayList.add(10);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(2);
        arrayList.add(1);


//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//            arrayList.remove(1);

//        }
        for (int i = 0; i < arrayList.size(); i++) {
            int integer = arrayList.get(i);
            if(integer >= 4) {
            resultList.add(integer);

            }

        }
        System.out.println(resultList);


        for (Integer integer : arrayList) {
            if(integer < 4) {
                int index = arrayList.indexOf(integer);
                arrayList.remove(index);
            }
//            arrayList.remove(2); нельзя одновременно и читать и удалять элементы
        }
        System.out.println(arrayList);
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        ListIterator<Integer> listIterator = arrayList.listIterator();



//        a.add(1);
//        a.add(2);
//        a.add(100);

//        System.out.println(a);
//
//
//        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.add(2);
//        myLinkedList.add(3);
//        myLinkedList.add(4);
//
//        System.out.println(myLinkedList);
//
//        Node head = myLinkedList.getHead();
//        System.out.println(head);
//        System.out.println(head.getNext());
//        System.out.println(myLinkedList.getHead().getNext());
    }
}