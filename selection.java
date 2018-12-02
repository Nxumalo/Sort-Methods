import java.util.*;
import java.io.*;
public class selection{
  public static void exchange(Comparable []a ,int i ,int j){
    Comparable t = a[i];
    a[i] = a[j];
    a[j] = t;
  }
  public static boolean less(Comparable v,Comparable w){
    return v.compareTo(w) < 0;
  }

  public static void sort(Comparable []a){
    int n = a.length;
    for(int i = 0;i<n;i++){
      int min = i;
      for(int j = i+1;j<n;j++){
        if(less(a[j],a[min])){
          min = j;
        }
      }
      exchange(a,i,min);
    }
  }
  public static void main(String [] args){
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
