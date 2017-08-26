package tests;

import java.util.ArrayList;
import java.util.Arrays;

public class PaperStrip {
	public static int minPieces(int[] original, int[] desired) {
        int i = 0;
        int min =0;
        ArrayList<Integer> tempCheck = new ArrayList<Integer>();
        for (int index = 0; index < desired.length; index++)
        {
        	tempCheck.add(0);
        }
        
        if(original.length == 0)
            return 0;
        while(i< original.length){
            int j = 0;
            while(i< original.length && j<desired.length){
            	while(tempCheck.get(j)==1){
            		j++;
            	}
                if(j<desired.length && original[i] == desired[j]){
                    while(i< original.length && j< original.length && original[i] == desired[j]){
                    	tempCheck.set(j, 1) ;
                        i++;j++;
                    }
                    min++;
                }
                else{
                    j++;
                }
            }
           
        }
        return min;
        
        
    }

    public static void main(String[] args) {
        int[] original = new int[] { 1, 4, 3, 2 };
        int[] desired = new int[] { 1, 2, 4, 3 };
        System.out.println(PaperStrip.minPieces(original, desired));
    }
}
