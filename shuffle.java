import java.util.Arrays;
public class shuffle{
  public static void exchange(Comparable a[],int i, int j){
    Comparable swap = a[i];
    a[i] = a[j];
    a[j] = swap;
  }

  public static void arrshuffle(Comparable a[]){
    int n = a.length;
    for(int i = 0;i<n;i++){
      int r = i+(int)(Math.random()*(n-i));
      exchange(a, i, r);
    }
  }
  public static void main(String []args){
    Comparable a[] = {1,2,3,4,5,6,7,8,9,20};
    System.out.println("Before Shuffle");
    System.out.println(Arrays.toString(a));
    System.out.println("After Shuffle");
    arrshuffle(a);
    System.out.println(Arrays.toString(a));
  }

}
