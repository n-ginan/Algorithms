package DSA.SortingAlgorithms;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int[] unsorted = new int[sc.nextInt()];
        int lesser;
        System.out.println("Unsorted elements: ");
        for (int s = 0; s < unsorted.length; s++) {
            unsorted[s] = sc.nextInt();
        }

        sc.close();

        System.out.print("The elements are: ");

        for (int i : unsorted) {
            System.out.print(i + " ");
        }

        System.out.println("");

        for (int i = 0; i < unsorted.length ; i++) {
            for (int j = 0; j < unsorted.length - 1; j++) { 
                if (unsorted[j] > unsorted[j + 1]) { 
                    lesser = unsorted[j + 1];  
                    unsorted[j + 1] = unsorted[j]; 
                    unsorted[j] = lesser; 
                    System.out.print("Right: ");
                    for (int numbers : unsorted) {
                        System.out.print(numbers + " ");
                    }
                    System.out.println("");
                    
                    if (j > 0) {
                        for (int k = j; k < unsorted.length - 1; k--) {
                            if (k < 1) {
                                break;
                            }
                            if (unsorted[k - 1] > unsorted[k]) { 
                                lesser = unsorted[k];
                                unsorted[k] = unsorted[k - 1];
                                unsorted[k - 1] = lesser;
                                System.out.print("Left: ");
                                for (int numbers : unsorted) {
                                    System.out.print(numbers + " ");
                                }
                                System.out.println("");
                            }
                        } 
                    }
                }
            }        
        }
    }
}
