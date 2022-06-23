package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void binarySearch(int arr[],int beg,int end,int key){
        int mid =(beg + end)/2;
        while(beg <= end){
            if(arr[mid] < key){
                beg =mid + 1;
            }else if(arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                end = mid - 1;
            }
            mid = (beg + end)/2;
        }
        if(beg > end)
            System.out.println("Element is not found");

    }
    public static void main(String[] args) {
        int [] arr = {10,2,99,45,24,9,16,5,17};
        System.out.println("The unsorted array is: ");
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);

        System.out.println("Enter item to search");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        int end = arr.length - 1;
        binarySearch(arr,0,end,key);

        }
}
