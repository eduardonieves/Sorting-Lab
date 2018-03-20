package sortersTesterClasses;

import sorterClasses.CocktailSort;
import sorterClasses.CombSorter;

public class Tester3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CocktailSort cocktailSort = new CocktailSort();
		CombSorter combSort = new CombSorter();

		Integer[] original = {5, 9, 20, 22, 20, 5, 4, 13, 17, 8, 22, 1, 3, 7, 11, 9, 10};
		
		showArray("Before Sort:	",original);
		cocktailSort.sort(original);
		showArray("After Cocktail Sort:",original);
		
		cocktailSort.sort(original);
		showArray("After Comb Sort:",original);
		
		
	}

	
	private static void showArray(String msg, Integer[] a) {
		System.out.print(msg); 
		for (int i=0; i<a.length; i++) 
			System.out.print("\t" + a[i]); 
		System.out.println();
	}
}
