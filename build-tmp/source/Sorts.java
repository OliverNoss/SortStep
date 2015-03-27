import java.util.*;

public class Sorts
{
  public void bubbleSort(int[] list)
  {
    int temp;
    for (int i=0; i<list.length-1; i++) {
      for (int j=0; j<list.length-1; j++) {
         
        if (list[j]>list[j+1])
        {
          temp = list[j];
          list[j] = list[j+1];
          list[j+1] = temp;
        }
      }
    }
  }

  public void selectionSort(int[] list)
  {
    int flag, temp;
    for (int i=0; i<list.length; i++) {
      flag = i;
      for (int j=i; j<list.length; j++) {
      if (list[j]<list[flag]) {flag = j;}
      }
      temp = list[i];
      list[i] = list[flag];
      list[flag] = temp;
    }
  }

  public void insertionSort(int[] list)
  {
    for (int i=0; i<list.length-1; i++) {
      for (int j=0; j<list.length-1; j++) {
      
      }
    }
  }

  private void merge(int[] a, int first, int mid, int last)
  {
    //your code here
  }

  public void mergeSort(int[] a, int first, int last)
  {
    //your code here
  }
}

