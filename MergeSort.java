import java.util.*;
import java.io.*;
public class MergeSort{
  public static Comparable [] aux;

  public static boolean less(Comparable v,Comparable w){
    return v.compareTo(w) < 0;
  }

  public static void sort(Comparable [] a){
    int n = a.length;
    aux = new Comparable [n];
    sort(a,0,n-1);
  }

  public static void merge(Comparable [] a , int low ,int mid, int high){
    int i = low;
    int j = mid+1;

    for(int k = low ;k<high;k++){
      aux[k] = a[k];
    }
    for(int k = low ;k<high;k++){
      if(i>mid)
          a[k] = aux[j++];
          else if(j>high)
              a[k] = aux[i++];
              else if(less(aux[j],aux[i]))
                  a[k] = aux[j++];
      else
          a[k] = aux[i++];
    }
  }
  public static void sort(Comparable [] a, int low , int high){
    if(high <= low)return;
    if(a[low])
    int mid = low+(high-low)/2;
    sort(a,low,mid);
    sort(a,mid+1,high);
    merge(a, low, mid, high);
  }
   public static void main(String[] args) {


     String [] array = new String[33];
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
     System.out.println(Arrays.toString(array));
     System.out.println("After Sort");
     sort(array);
     System.out.println(Arrays.toString(array));
     }
     catch(FileNotFoundException e){
       System.out.println("Fucking file was not found"+e);
       }
     }



  }
