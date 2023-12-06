package DSA.ArrayAlgorithms;

public class BubbleSort {
    public static void main(String[] args) throws Exception {

        int[] bubbleSort = {31, 12, 25, 8};
        System.out.print("Unsorted Array: ");
        for (int numbers : bubbleSort) {
            System.out.print(numbers + " ");
        }
        System.out.println("");

        //-----ARRAY-BUBBLE-SORT-----//

        int secondHolder;
        for (int i = 0; i < bubbleSort.length - 1; i++) { //i = 2
            for (int j = 0; j < bubbleSort.length - 1; j++) { //j=2
                if (bubbleSort[j] > bubbleSort[j + 1]) { //25 > 31
                    secondHolder = bubbleSort[j];       // 12
                    bubbleSort[j] = bubbleSort[j + 1]; //  b[0] == 8
                    bubbleSort[j + 1] = secondHolder; //  b[1] == 12
                    
                    System.out.print("Bubble Sort: ");
                    for (int numbers : bubbleSort) {
                        System.out.print(numbers + " ");
                    }
                    System.out.println("");
                } // {8, 12, 25, 31}
            }
        }

        System.out.print("Bubble Sorted: ");
        for (int numbers : bubbleSort) {
            System.out.print(numbers + " ");
        }
        System.out.println("");
        //-----ARRAY-BUBBLE-SORT-----//
    }
}
