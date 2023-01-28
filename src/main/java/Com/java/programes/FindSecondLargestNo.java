package Com.java.programes;

public class FindSecondLargestNo {
	
	
	public static int getSecondLargest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++){  
	        for (int j = i + 1; j < total; j++) {  
	            if (a[i] > a[j]) {  
	                temp = a[i];  
	                a[i] = a[j];  
	                a[j] = temp;  
	            }  
	        }  
	    }  
		return a[total-3];  
	} 
	
	public static int getSecondLargest1(int[] a){  
		int temp;  
		for (int i = 0; i < a.length; i++){  
	        for (int j = i + 1; j < a.length; j++) {  
	            if (a[i] > a[j]) {  
	                temp = a[i];  
	                a[i] = a[j];  
	                a[j] = temp;  
	            }  
	        } 
	    }  
		return a[a.length-3];  
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,5,6,10,3,2};  
		System.out.println("Second Largest: "+getSecondLargest(a,7));  
		System.out.println("Second Largest: "+getSecondLargest1(a));  
	}

}
