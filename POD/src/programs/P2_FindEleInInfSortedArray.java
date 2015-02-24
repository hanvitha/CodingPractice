package programs;

import java.util.Scanner;

public class P2_FindEleInInfSortedArray {

	
	public static void main(String[] args) {
		int a[] = new int[100000];
		for(int i=0;i<100000;i++){
			a[i]= i;
		}
		Scanner sc = new Scanner(System.in);
		int key =sc.nextInt();
		System.out.println("element found at : " + FindElement(a,key));
	}

	private static int FindElement(int[] a, int key) {
		if(a[0]>key){
			return -1;
		}
		if(a.length==0){
			return -1;
		}
		int low = 0;
		int high =1;
		while(true){
			if(a[high]<key){
				low = high;
				high = high * 2;
			}
			else {
				return BinarySearch(a,low,high,key);
			}
		}
	}

	private static int BinarySearch(int[] a, int low, int high, int key) {
		int mid = (high + low )/2;
			while(low<=high){
				if(a[mid]== key){
					return mid;
				}
				else if(a[mid]< key){
					return BinarySearch(a, mid+1, high, key);
				}
				else{
					return BinarySearch(a, low, mid-1, key);
				}
			}
			return -1;
	}

}
