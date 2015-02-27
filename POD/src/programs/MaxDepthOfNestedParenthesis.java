package programs;

public class MaxDepthOfNestedParenthesis {

	
	public static void main(String[] args) {
		String str = "(b)(B) (c) ()";//
		int max =0;
		int balance =0;
		boolean reachedMaxDepth = false;
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)=='('){
				balance++;
				if(balance>max || ( balance==max && !reachedMaxDepth ) ){
					max++;
				}
			}
			else if(str.charAt(i)==')'){
				balance--;
			}
			if(balance == max){
				reachedMaxDepth = true;
			}
			if(balance<0){
				break;
			}
		}
		
		if(balance!=0){
			System.out.println("-1 not balanced !");
		}
		else{
			System.out.println("max depth is : "+max);
		}
	}

}
