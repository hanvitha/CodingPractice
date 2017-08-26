package medium;

public class NextPermutation {

	public static void main(String[] args) {
		int[] a = {2,3,1,3,3};
		nextPermutation(a);
		for(int i :a){
			System.out.print(i+"  ");
		}

	}
	public static void nextPermutation(int[] a) {
        int len = a.length;
        if(len==0 || len==1)
        	return;

        int i=len-2;
        while(i>=0 && a[i+1]<=a[i]){
        	i--;
        }
       if(i>=0){
    	   int j = len-1;
           while(j>i && a[j] <= a[i]){
        	   j--;
           }
           swap(a, i, j);
       }
       reverse(a, i+1);
    }
	private static void swap(int[] a, int i, int j) {
		 int temp = a[i];
	     a[i]=a[j];
	     a[j] = temp;
	}
	private static void reverse(int[] a, int start) {
		int i=start;
		int j=a.length-1;
		while(i<j){
			swap(a, i, j);
			i++;
			j--;
		}
	}

}
