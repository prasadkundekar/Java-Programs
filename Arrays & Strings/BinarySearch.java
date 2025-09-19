import java.util.*;
public class BinarySearch {
    
    public static int bs(int a[],int key){
        int start = 0 , end=a.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(key==a[mid]){
                return mid;
            }

            if(key<a[mid]){
                end = mid-1;
            }
              else {
                start = mid+1;
              }
        } 
          return -1;
    }

    public static void main(String args[]){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the size of array");
        int size=s.nextInt();
        int n[]=new int[size];

        System.out.println("Enter elements of array");
        for(int i=0;i<size;i++){
          n[i]=s.nextInt();
        }
          System.out.println("Enter the number you want to find");
      
          int key = s.nextInt();
          
          System.out.println("Number found at index" + " " + bs(n, key));
        
          s.close();
    }
}
   