package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import databases.ConnectDB;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
	List<Integer> list = new ArrayList<Integer> ();
	list.add(10);
	list.add(15);
	list.add(20);
	list.add(30);
	//for (int i=0;i<list.size();i++)
	//	System.out.println(list.get(i));
	for (Integer it:list)
		System.out.println(it);
	ConnectDB db = new ConnectDB();
		db.InsertDataFromArrayListToMySql(Collections.singletonList(list),"numbers", "num");

	}

}
