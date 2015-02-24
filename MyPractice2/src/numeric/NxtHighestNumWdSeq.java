package numeric;

import java.util.Arrays;

public class NxtHighestNumWdSeq {

	public static void main(String[] args) {
		int n = 123456789;
		int num[] = new int[9];
		for(int i=0;i<num.length;i++){
			num[num.length-i-1] = n%10;
			n=n/10;
		}
		
		num = FindNextHigh(num);
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]);
		}
	}

	private static int[] FindNextHigh(int[] num) {
		int p= num.length -2 ;
		while(p>=0 && num[p]>=num[p+1]){
				p=p-1;
		}
		int minIndex = MinIndexOf(p,num);
		num = swap(p,minIndex,num);
		num = sort(num,p+1);
		
		if(p<0){
			System.out.println("no element greater is found");
			System.exit(-1);
		}
		return num;
	}

	private static int[] sort(int[] num, int p) {
		int pTemp=p;
		int[] temp = new int[num.length -p];
		for(int i=0;i<temp.length;i++){
			temp[i] = num[p++];
		}
		Arrays.sort(temp);
		int i=0;
		while(pTemp<num.length){
			num[pTemp++] = temp[i++];
		}
		return num;
	}

	private static int[] swap(int p, int minIndexOf,int[] num) {
		int temp = num[p];
		num[p] = num[minIndexOf];
		num[minIndexOf] = temp;
		return num;
	}

	private static int MinIndexOf(int p, int[] num) {
		int pTemp=p;
		p++;
		int min= p;
		
		while(p<num.length){
			if(num[pTemp]<num[p] && num[p]<num[min]){
				min=p;
			}
			p++;
		}
		return min;
	}

}
