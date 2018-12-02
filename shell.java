import java.util.*;
public class shell{
  public static void exchange (Comparable a[], int i,int j){
    Comparable t = a[i];
    a[i] = a[j];
    a[j] = t;
  }

  public static boolean less(Comparable v,Comparable w){
    return v.compareTo(w) < 0;
  }

  public static void sort(Comparable a[]){
    int n = a.length;
    int h = 1;
    while(h<n/3){
      h = 3*h+1;
    }
    while(h>=1){
      for(int i = h;i<n;i++){
        for(int j = i;j>=h && less(a[j],a[j-h]);j -=h){
          exchange(a,j,j-h);
        }
      }
      h = h/3;
    }
  }
  public static void main(String [] args){
    Comparable a[] = {12,34,467,787,9,89,909,456,66555,656,56,87,8,34,321,432,323,67674,3424,78,242,324};
    System.out.println("Before Sort");
    System.out.println(Arrays.toString(a));
    sort(a);
    System.out.println("After Sort");
    System.out.println(Arrays.toString(a));
  }
}
