/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testsorts;

/**
  * Sort algorithms are tested.
  */
 
 import static java.lang.System.currentTimeMillis;
 import java.util.Random;
import java.util.Scanner;
 
 public class TestSorts {
 	
 	public static void displayArray(int[] array) {
 		for (int i = 0; i < array.length; i++) {
 			System.out.print(array[i] + "  ");
 		}
 		System.out.println("\n");
 	}
 	
 	public static void sortIntArray() {
		Scanner input = new Scanner(System.in);
		int numItems, searchNum, location;
		int[] test;
		Random rand = new Random();
                double start=0;
                double finish=0;
                double total=0;
		
		System.out.print("Enter number of elements: ");
		numItems = input.nextInt();
		
		/* populate array */
		test = new int[numItems];
		for (int i = 0; i < test.length; i++) {
			test[i] = rand.nextInt(100);
		}
		System.out.println("Unsorted:");
		displayArray(test);
		start = currentTimeMillis();
                //Sorts.selectionSort(test);
                Sorts.insertionSort(test);
		//Sorts.mergesort(test, 0, test.length - 1);
                finish = currentTimeMillis();
                total = finish - start;
		
		
		
//		System.out.println("Sorted:");
//		displayArray(test);
		System.out.println("The time taken is:" + total + " ms");
		/* search for number in sorted array */
		System.out.print("Enter a number to search for: ");
		searchNum = input.nextInt();
		while (searchNum != -1){
                        start = currentTimeMillis();
			location = Searches.ternarySearch(test, 0, test.length-1, searchNum);
                        finish = currentTimeMillis();
                        total = finish - start;
                        System.out.println("The time taken is:" + total + " ms");
			System.out.println("Number at position: " + location);
			System.out.print("Enter a number to search for: ");
			searchNum = input.nextInt();
		}
  	}


 	public static void displayArray(Circle[] array) {
 		for (int i = 0; i < array.length; i++) {
 			System.out.println(array[i] + "  ");
 		}
 		System.out.println("\n");
 	}
 	
 	
 	public static void sortObjectArray() {
 		Scanner input = new Scanner(System.in);
		int numObjects;
		Circle[] test;
		Random rand = new Random();
		
		System.out.print("Enter number of objects: ");
		numObjects = input.nextInt();
		input.close();
		
		/* populate array */
		test = new Circle[numObjects];
		for (int i = 0; i < test.length; i++) {
			test[i] = new Circle(rand.nextInt(10));
		}
		System.out.println("Unsorted:");
		displayArray(test);
		
		Sorts.selectionSort(test);
		
		System.out.println("Sorted:");
		displayArray(test);	
 	}
 	
 	
	public static void main(String[] args) {
		sortIntArray();
                //sortObjectArray();
	}
}
