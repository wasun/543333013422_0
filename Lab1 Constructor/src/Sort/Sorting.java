package Sort;


public class Sorting {

	private int[] SortingArray = new int[50];

	private int SortingSize = 10;

	public void RandomArray(){

		for(int a = 0; a < SortingSize; a++){

			SortingArray[a] = (int)(Math.random()*10)+10;

		}

	}
	public void PrintArray(){

		System.out.println("----------");
		for(int i = 0; i < SortingSize; i++){

			System.out.print("| " + i + " | ");
			System.out.println(SortingArray[i] + " |");

			System.out.println("----------");

		}

	}

	public int ValueAtIndex(int index){

		if(index < SortingSize) return SortingArray[index];

		return 0;

	}

	public boolean ArrayContainValue(int searchValue){

		boolean valueInArray = false;

		for(int i = 0; i < SortingSize; i++){

			if(SortingArray[i] == searchValue){

				valueInArray = true;

			}

		}

		return valueInArray; }

	public void DeleteIndex(int index){

		if(index < SortingSize){

			for(int i = index; i < (SortingSize - 1); i++){

				SortingArray[i] = SortingArray[i+1];

			}

			SortingSize--;

		}

	}



	public void HorzArray(int i, int j){

		for(int n = 0; n < 51; n++)System.out.print("-");

		System.out.println();

		for(int n = 0; n < SortingSize; n++){

			System.out.print("| " + n + "  ");
		}

		System.out.println("|");

		for(int n = 0; n < 51; n++)System.out.print("-");

		System.out.println();

		for(int n = 0; n < SortingSize; n++){

			System.out.print("| " + SortingArray[n] + " ");
		}

		System.out.println("|");

		for(int n = 0; n < 51; n++)System.out.print("-");

		System.out.println();

		if(j != -1){

			for(int k = 0; k < ((j*5)+2); k++)
				System.out.print(" ");
			System.out.print(j);
		}

		if(i != -1){
			for(int l = 0; l < (5*(i - j)-1); l++)
				System.out.print(" ");
			System.out.print(i);
		}
		System.out.println(); }

	public void BubbleSort(){

		for(int i = SortingSize - 1; i > 1; i--){

			for(int j = 0; j < i; j++){

				if(SortingArray[j] > SortingArray[j + 1]){

					swapValues(j, j+1);

					HorzArray(i, j);  }

			}
		}
	}

	public void swapValues(int indexOne, int indexTwo){

		int temp = SortingArray[indexOne];
		SortingArray[indexOne] = SortingArray[indexTwo];
		SortingArray[indexTwo] = temp;

	}

	public void binarySearchForValue(int value){

		int lowIndex = 0;
		int highIndex = SortingSize - 1;

		while(lowIndex <= highIndex){

			int middleIndex = (highIndex + lowIndex) / 2;
			if(SortingArray[middleIndex] < value) lowIndex = middleIndex + 1;

			else if(SortingArray[middleIndex] > value) highIndex = middleIndex - 1;

			else {

				System.out.println("\nFound a Match for " + value + " at Index " + middleIndex);

				lowIndex = highIndex + 1; }

			HorzArray(middleIndex, -1); }

	}

	public void SelectionSort(){

		for(int x=0; x < SortingSize; x++){
			int minimum = x;

			for(int y=x; y < SortingSize; y++){

				if(SortingArray[minimum]>SortingArray[y]){
					minimum = y;  }
			}

			swapValues(x, minimum);

			HorzArray(x, -1);  }

	}

	public void InsertionSort(){

		for (int i = 1; i < SortingSize; i++){

			int j = i;
			int toInsert = SortingArray[i];

			while ((j > 0) && (SortingArray[j-1] > toInsert)){
				SortingArray[j] = SortingArray[j-1];
				j--;

				HorzArray(i, j); }

			SortingArray[j] = toInsert;
			HorzArray(i, j);
			System.out.println("\nArray[i] = " + SortingArray[i] + " Array[j] = " + SortingArray[j] + " toInsert = " + toInsert + "\n");
		}

	}

	public static void main(String[] args){

		Sorting newArray = new Sorting();

		newArray.RandomArray();

		newArray.BubbleSort();

		newArray.SelectionSort();

		newArray.InsertionSort();

	}

}