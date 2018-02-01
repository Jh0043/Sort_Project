
import java.util.*;

public class Sorts{
  private long steps;
  private long stepsOfSearch;
  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public Sorts(){
    steps = 0;
    stepsOfSearch = 0;
  }
  public boolean findNumber(int searchNum, ArrayList <Integer> list){
      int length = list.size(); 
      int place1 = 0;
      boolean yes = false; 
      if(list.size() == 2){
          for(int j = 0; j < place1; j++){
             if(searchNum == list.get(j)) yes = true;
            }
        }
      else{
          place1 = list.get(length / 2);
          if(searchNum < place1){
             for(int i = length; i > place1; i--){
                 list.remove(list.get(i));
                 
                }
             return findNumber(searchNum, list);
             // for(int j = 0; j < place1; j++){
             //     if(whatNum == list.get(j)) return true;
            }
          
          if(searchNum > place1){
             for(int i = 0; i < place1; i++){
                 list.remove(list.get(i));
                }
             return findNumber(searchNum, list);
            } 
        }
      
      
      return yes; 
    }
  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Integer> list){
    //replace these lines with your code
    int length = list.size();
    int temp = 0;
    for(int i = 0; i < length; i++){
        for(int j = 0; j < (length - i - 1); j++){
            steps += 3;
            if((Integer)list.get(j) > list.get(j + 1)){
                steps += 4;
                temp = list.get(j);
                list.set(j, list.get(j+1));
                list.set(j+1, temp);
               }
           }
       }
    System.out.println();
    System.out.println("Bubble Sort");
    System.out.println();
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void selectionSort(ArrayList <Integer> list){
    //replace these lines with your code
    int length = list.size();
    int temp = 0;
    for(int i = 0; i < length - 1; i++){
        int index = i;
        for(int j = i + 1; j < length; j++){
            steps += 3;
            if((Integer)list.get(j) < (Integer)list.get(index)){
                index = j;
            }
        }
        steps += 4;
        int smallerNumber = (Integer)list.get(index);
        list.set(index, list.get(i));
        list.set(i, smallerNumber);
    }

    System.out.println();
    System.out.println("Selection Sort");
    System.out.println();
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(ArrayList <Integer> list){
    //replace these lines with your code
    int length = list.size();
    for(int i = 1; i < length; i++){
        steps++;
        int temp = (Integer)list.get(i);
        int j = i - 1; 
        while(j>=0 && (Integer)list.get(j) > temp){
            steps += 3;
            list.set(j + 1, list.get(j));
            j = j - 1;
 
        }
        steps++;
        list.set(j + 1, temp);
    }
    System.out.println();
    System.out.println("Insertion Sort");
    System.out.println();
  }
  public void mergeSort(ArrayList <Integer> list, int low, int high) {
        // check if low is smaller than high, if not then the array is sorted
        if( low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            //System.out.print ("low " + low + "middle " + middle + " high " + high);
            // Sort the left side of the array
            mergeSort(list, low, middle);
            // Sort the right side of the array
            mergeSort(list, middle + 1, high);
            // Combine them both
            merge(list, low, middle, high);
        }
    }
  private void merge(ArrayList <Integer> list, int low, int middle, int high) {
    ArrayList <Integer> helper = new ArrayList <Integer> ();

    int i = low;
    int j = middle + 1;
    // Copy the smallest values from either the left or the right side
    // to the helper
    while (i <= middle || j <= high) {
        if (i > middle) {
            helper.add(list.get(j));
            j++;
            steps++;
        }
        else if (j > high){
            helper.add(list.get(i));
            i++;
            steps++;
        }
        else if (list.get(i) <= list.get(j)) {
            steps += 3;
            helper.add(list.get(i));
            i++;
            steps ++; 
        } else {
            helper.add(list.get(j));
            j++;
            steps++;
        }
    }
    int m = low;
    // Copy the merged part back into the original list from low to high index
    for(int l = 0; l < helper.size(); l++) {
        list.set(m, helper.get(l));
        steps++;
        m++;
    }
        }
  /**
   *  Accessor method to return the current value of steps
   *
   */
  public long getStepCount(){
    return steps;
  }
  public long getStepSearch(){
      return stepsOfSearch;
    }
  /**
   *  Modifier method to set or reset the step count. Usually called
   *  prior to invocation of a sort method.
   *
   * @param  stepCount   value assigned to steps
   */
  public void setStepCount(long stepCount){
    steps = stepCount;
  }
  public void setStepSearch(long StepSearch){
      stepsOfSearch = StepSearch;
    }
}
