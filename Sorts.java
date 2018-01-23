
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
  public void bubbleSort(ArrayList <Comparable> list){
    //replace these lines with your code
    int length = list.size();
    int temp = 0;
    for(int i = 0; i < length; i++){
        for(int j = 1; j < (length - 1); j++){
            if((Integer)list.get(j - 1) > (Integer)list.get(j)){
                temp = (Integer)list.get(j - 1);
                list.set(list.indexOf(j-1), (Integer)list.get(j));
                list.set(list.indexOf(j), temp);
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
  public void selectionSort(ArrayList <Comparable> list){
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
        list.set(list.indexOf(index), list.get(i));
        list.set(list.indexOf(i), smallerNumber);
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
  public void insertionSort(ArrayList <Comparable> list){
    //replace these lines with your code
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
