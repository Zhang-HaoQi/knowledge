package link_table_03.stack;

import link_table_03.base_02.LinkedList;
import stack_queue_02.stack.Stack;

/**
 * @Classname LinkStack
 * @Description TODO
 * @Date 2021/12/30 21:12
 * @Created by zhq
 */
public class LinkedStack<E> implements Stack<E> {
    private LinkedList<E> list;

    public LinkedStack() {
        this.list = new LinkedList<>();
    }


    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFist();
    }

    @Override
    public E peek() {
        return list.getFront();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack:top");
        res.append(list);
        return res.toString();
    }
}
