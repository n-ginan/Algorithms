package DSA.SortingAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args){ 
    List<Integer> selection = new ArrayList<>();
    Collections.addAll(selection, 38, 30, 6, 12, 33, 50, 1, 3);
    int minValue;
    
    System.out.print("Unsorted: ");
    selection.forEach((unsorted) -> System.out.print(unsorted + " "));
    System.out.println("");

    for (int i = 0; i < selection.size(); i++) { 
      minValue = selection.get(i); 

        for (int j = i; j < selection.size(); j++) { 
        if (minValue > selection.get(j)) { 
            minValue = selection.get(j); 
        }
      }

      for (int k = i; k < selection.size(); k++) { 
        if (minValue == selection.get(k)) { 
            Collections.swap(selection, i, k); 
            break;
        }
      }

      System.out.print("Swapped selection: ");
      selection.forEach((number) -> System.out.print(number + " ")); 
      System.out.println("");
    }

    System.out.print("Selection: ");
    selection.forEach((numbers) -> System.out.print(numbers + " ")); 
  }
}
