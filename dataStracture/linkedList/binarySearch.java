package linkedList;

public class binarySearch {
	public static void search(int array[], int key){
		int low = 0 ;
		int high = array.length-1;
		int mid = (low+high)/2;
		
		while(low <= high){
			
		if(array[mid] < key){
		low = mid + 1; }
		
		else if (array[mid] == key){
		System.out.print(key +" is found at index "+mid+ "\n");
		break;  }
		
		else{
		high = mid-1;  }
		
		mid = (low+high)/2;	}
		
		if(low > high) {
			System.out.println("key "+key+" not found in array !");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]array= {10,3,6,1,8,4,15,20,17,25,27,39,60,2};
		int key =3;
		
		search(array ,key);
		
	}

}
