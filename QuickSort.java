import java.util.*;
import java.io.*;
public class QuickSort{
  public static void exchange(Comparable [] a,int i,int j){
    Comparable swap = a[i];
    a[i] = a[j];
    a[i] = swap;
  }
  public static boolean less(Comparable v,Comparable w){
    if(v == w) return false;
    return v.compareTo(w) <0;
  }
  public static void shuffle(Comparable a[]){
    int n = a.length;
    for(int i = 0;i<n;i++){
      int r = i +(int)(Math.random()*(n-i));
      exchange(a, i, r);
    }
  }
  public static void sort(Comparable a[]){
    shuffle(a);
    sort(a,0,a.length-1);
  }
  public static void sort(Comparable a[],int low,int high){
    if(high<=low) return;
    int j = partition(a,low,high);
    sort(a,low,j-1);
    sort(a,j+1,high);
  }
  public static int partition(Comparable a[],int low,int high){
    int i = low;
    int j = high + 1;
    Comparable v = a[low];
    while(true){
      while(less(a[++i], v))
          if(i == high) break;
      while(less(v,a[--j]))
          if(j == low) break;
    if(i>=j) break;
    exchange(a, i, j);
    }
    exchange(a,low,j);
    return j;
  }
  public static void main(String[] args) {
    String [] array = new String[33];
    Comparable [] array2 = {23,435,467,78789,80,77,56,343,53,578,90,245,453454,78,6789,689};
    int counter = 0;
    try{
    File file=new File("C:\\Users\\Create Vision\\Documents\\Java Workspace\\Holiday\\SymbolTable\\dummyText.txt");
    Scanner textfile = new Scanner(file);
    // reading from the textfile according the words found
    while(textfile.hasNext()){
      String word = textfile.next();
      array[counter] = word;
      counter++;
    }
    textfile.close();
    System.out.println("Before Sort");
    System.out.println(Arrays.toString(array2));
    System.out.println("After Sort");
    sort(array2);
    System.out.println(Arrays.toString(array2));
    }
    catch(FileNotFoundException e){
      System.out.println("Fucking file was not found"+e);
      }
    }
  }
