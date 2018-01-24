
import java.util.*;

public class Sorts{
  private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public Sorts(){
    steps = 0;
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
            if((Integer)list.get(j) > list.get(j + 1)){
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
            if((Integer)list.get(j) < (Integer)list.get(index)){
                index = j;
            }
        }
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
        int temp = (Integer)list.get(i);
        int j = i - 1; 
        while(j>=0 && (Integer)list.get(j) > temp){
            list.set(j + 1, list.get(j));
            j = j - 1;
        }
        list.set(j + 1, temp);
    }
    System.out.println();
    System.out.println("Insertion Sort");
    System.out.println();
  }
 
  /**
   *  Accessor method to return the current value of steps
   *
   */
  public long getStepCount(){
    return steps;
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
}
