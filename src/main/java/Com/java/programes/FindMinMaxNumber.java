package Com.java.programes;

import org.bouncycastle.util.Arrays;

public class FindMinMaxNumber {

	static int array[]={100,101,5,-10};


	public void findMaxAndMin(){
		int maximum=array[0];
		int minimum=array[0];
		int arrayLength=array.length;
		for(int i=0;i<arrayLength;i++){

			if(array[i]>maximum){
				maximum=array[i];
			}
			if(array[i]<minimum){
				minimum=array[i];
			}

		}
		System.out.println("Maximum : "+ maximum +" Minimum  : "+ minimum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMinMaxNumber mm = new FindMinMaxNumber();
		mm.findMaxAndMin();
		
	}

}
