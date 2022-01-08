package link_table_03.queue_02;

import stack_queue_02.queue.Queue;

/**
 * @Classname LinkedQueueMain02
 * @Description 无虚拟头结点
 * @Date 2022/1/2 11:24
 * @Created by zhq
 */
public class LinkedQueueMain02 {
    public static void main(String[] args) {
        Queue<Integer> linkedQueue = new LinkedQueue<>();
        for (int i = 0; i < 10; i++) {
            linkedQueue.enqueue(i);
            System.out.println(linkedQueue);
            if (i%3==2){
                linkedQueue.dequeue();
            }
        }
        for (int i = 0; i < 10; i++) {
            linkedQueue.dequeue();
            System.out.println(linkedQueue);
        }
        System.out.println(linkedQueue);
    }
}
