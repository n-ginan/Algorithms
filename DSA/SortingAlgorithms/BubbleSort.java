package DSA.SortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int[] bubbleSort = new int[sc.nextInt()];
        int secondHolder;
        
        System.out.println("Input the elements: ");

        for (int s = 0; s < bubbleSort.length; s++) {
            bubbleSort[s] = sc.nextInt();
        }

        sc.close();

        System.out.print("The elements are: ");

        for (int i : bubbleSort) {
            System.out.print(i + " ");
        }

        System.out.println("");

        for (int i = 0; i < bubbleSort.length - 1; i++) { 
            for (int j = 0; j < bubbleSort.length - 1; j++) { 
                if (bubbleSort[j] > bubbleSort[j + 1]) { 
                    secondHolder = bubbleSort[j];       
                    bubbleSort[j] = bubbleSort[j + 1]; 
                    bubbleSort[j + 1] = secondHolder; 
                    
                    System.out.print("Bubble Sort: ");

                    for (int numbers : bubbleSort) {
                        System.out.print(numbers + " ");
                    }
                    
                    System.out.println("");
                } 
            }
        }

        System.out.print("Bubble Sorted: ");
        for (int numbers : bubbleSort) {
            System.out.print(numbers + " ");
        }
        System.out.println("");
       
    }
}
