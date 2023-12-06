package DSA.SortingAlgorithms;

public class BubbleSort {
    public static void main(String[] args) throws Exception {

        int[] bubbleSort = {31, 12, 25, 8, 45};
        System.out.print("Unsorted Array: ");
        int secondHolder;

        for (int numbers : bubbleSort) {
            System.out.print(numbers + " ");
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
