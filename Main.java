import java.util.ArrayList;
public class Main{
  //This is just incase I missed any of the requirements.
  //recursive
  public static int factorial(int a){
    if(a > 1){
      return a * (factorial(a-1));
    }
    return 1;
  }
  //Recursively traverses a String.
  public static String reverse(String a, String b){
    if(a.length() > 0){
      b += a.substring(a.length()-1,a.length());
      return reverse(a.substring(0, a.length()-1), b);
    }
    return b;
  }
  //Recursively transverses an array
  public static  int recursiveTraversal(int[] arr, int index, int b) {
    if (index >= arr.length) {
      return 0;
    }
    return arr[index] + recursiveTraversal(arr, index + 1, b);
  }
  //Recursively traverses an ArrayList
  public static void recursiveTraversal(ArrayList<Integer> list, int index) {
    if (index >= list.size()) {
      return;
    }
    
    System.out.println(list.get(index));
    recursiveTraversal(list, index + 1);
  }
  //merge sort
  public static void mergeSort(int[] array, int left, int right) {
    if (left < right) {
      int mid = (left + right) / 2;
      
      mergeSort(array, left, mid);
      mergeSort(array, mid + 1, right);
      
      merge(array, left, mid, right);
    }
  }
  
  public static void merge(int[] array, int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;
    
    int[] leftArray = new int[n1];
    int[] rightArray = new int[n2];
    
    for (int i = 0; i < n1; i++) {
      leftArray[i] = array[left + i];
    }
    
    for (int j = 0; j < n2; j++) {
      rightArray[j] = array[mid + 1 + j];
    }
    
    int i = 0, j = 0, k = left;
    
    while (i < n1 && j < n2) {
      if (leftArray[i] <= rightArray[j]) {
        array[k] = leftArray[i];
        i++;
      } else {
        array[k] = rightArray[j];
        j++;
      }
      k++;
    }
    
    while (i < n1) {
      array[k] = leftArray[i];
      i++;
      k++;
    }
    
    while (j < n2) {
      array[k] = rightArray[j];
      j++;
      k++;
    }
  }
  //binary sort
  public static int binarySearch(int[] array, int target) {
    int left = 0;
    int right = array.length - 1;
    
    while (left <= right) {
      int mid = left + (right - left) / 2;
      
      if (array[mid] == target) {
        return mid;
      }
      
      if (array[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }
  
  public static void main(String[] args){
    
    int a = factorial(4);
    String b = reverse("bruh", "");
    int[] arr = { 1, 2, 3, 4, 5 };
    int c =   recursiveTraversal(arr, 0, 0);
    
  }
}
