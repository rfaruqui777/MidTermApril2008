package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
        Queue<String> queue = new LinkedList<>();
        queue.add("Afsana");
        queue.add("Afroza");
        queue.add("Sabrina");
        for (String it:queue)
            System.out.println(it);

        Iterator it = queue.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
	}

}
