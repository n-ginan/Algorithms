package DSA.SortingAlgorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] unsorted = {50, 34, 5, 1, 7};
        int lesser;
        System.out.print("Unsorted: ");
        for (int numbers : unsorted) {
            System.out.print(numbers + " ");
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
<<<<<<< HEAD

=======
>>>>>>> e29c55e ("rah")
