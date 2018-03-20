package sorterClasses;

public class CocktailSort {

	//Worst Case: O(N^2)
	
	public CocktailSort() {
		super();
	}
	
	public void sort(Integer[] arr)
    {
		 int n = arr.length;
		 boolean sorted = false;
		 boolean foundUnsorting = false;
		 
		 while(!sorted){
			 for(int i = 0; i < n-1; i++){
				 if(arr[i] > arr[i+1]){
					 int temp = arr[i];
					 arr[i] = arr[i+1];
					 arr[i+1] = temp;
				 }
			 }
			 
			 foundUnsorting = false;
			 for(int j = n-1; j >= 1; j--){
				 if(arr[j] < arr[j-1]){
					 foundUnsorting = true;
					 int temp = arr[j];
					 arr[j] = arr[j-1];
					 arr[j-1] = temp;
				 }
			 }
			 
			 if(!foundUnsorting){
				 sorted = true;
			 }
			 
			 
		 }
	       
		
		
    }
}
