package math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int[] array = new int[]{100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 88, 86, 84, 82, 80, 78, 76, 74, 72, 70, 67,
				64, 61, 58, 55, 52, 49, 46, 43, 40, 36, 32, 28, 24, 20, 15, 10, 4};
		for (int i = 0; i < array.length; i++) {
			int decresingRate = array[i + 1] - array[i];
			System.out.println(decresingRate);
		}
		ConnectDB connectDB = new ConnectDB();
		List<String> lowestValue = new ArrayList<String>();
		try {
			connectDB.InsertDataFromArryToMySql(array, "selection_sort", "SortingNumbers");
			lowestValue = connectDB.readDataBase("selection_sort", "SortingNumbers");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (selection_sort) and displaying to the console");
		for(String st:lowestValue){
			System.out.println(st);
		}
	}
}
