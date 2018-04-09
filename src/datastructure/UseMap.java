package datastructure;
import databases.ConnectDB;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> listBookScience = new ArrayList<String> ();
		listBookScience.add("Math");
		listBookScience.add("Science");
		listBookScience.add("Physics");
		listBookScience.add("Chemistry");
		List<String> listBookGeneral = new ArrayList<String> ();
		listBookGeneral.add("English");
		listBookGeneral.add("ICT");
		listBookGeneral.add("Bengali");
		Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
		map.put("Science", listBookScience);
		map.put("General", listBookGeneral);
		for (Map.Entry entry:map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
			ConnectDB db = new ConnectDB();
			db.InsertDataFromArrayListToMySql(Collections.singletonList(map),"BookList", "Book_Name");

		}
	}

