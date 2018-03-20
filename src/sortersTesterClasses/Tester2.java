package sortersTesterClasses;

import java.util.ArrayList;
import java.util.Comparator;

import interfaces.Sorter;
import sorterClasses.BubbleSortSorter;
import sorterClasses.InsertionSortSorter;
import sorterClasses.SelectionSortSorter;

public class Tester2 {

	private static ArrayList<Sorter<Integer>> sortersList = new ArrayList<>(); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortersList.add(new BubbleSortSorter<Integer>()); 
		sortersList.add(new SelectionSortSorter<Integer>()); 
		sortersList.add(new InsertionSortSorter<Integer>()); 
		test("Sorting Using IntegerComparator2 (Increasing Order", new IntegerComparator1()); 
		test("Sorting Using IntegerComparator2 (Decreasing Order", new IntegerComparator2()); 
	}

	private static void test(String msg, Comparator<Integer> cmp) { 
		System.out.println("\n\n*******************************************************");
		System.out.println("*** " + msg + "  ***");
		System.out.println("*******************************************************");
		
		Integer[] original = {5, 9, 20, 22, 20, 5, 4, 13, 17, 8, 22, 1, 3, 7, 11, 9, 10};
		Integer[] arr;
		for (int s=0; s<sortersList.size(); s++) {
			Sorter<Integer> sorter = sortersList.get(s); 
		    arr = original.clone(); 
		    sorter.sort(arr, cmp);
		    showArray(sorter.getName() + ": ", arr); 
		}
		
	}
	
	private static void showArray(String msg, Integer[] a) {
		System.out.print(msg); 
		for (int i=0; i<a.length; i++) 
			System.out.print("\t" + a[i]); 
		System.out.println();
	}
}
