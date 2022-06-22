package linkedList;
import java.io.*;
public class nodes {
	public static void Binarysearch(int arr[], int first, int last, int target){
		int mid = (last+first)/2;
		while(first <= last){
		if(arr[mid] < target){
		first = mid + 1;
		} else if (arr[mid] == target){
		System.out.println("The number is found at index "+mid+ ".");
		break;
		} else{
		last = mid-1;
		}
		mid = (last+first)/2;
		}
		if(first > last){
		System.out.println("The number isn't found.");
		}
		}
}