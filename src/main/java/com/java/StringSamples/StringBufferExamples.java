package com.java.StringSamples;

public class StringBufferExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String is Immutable");
		String name = "Arya";
		System.out.println("Appending a name to Original: " + name.concat("prasath"));
		System.out.println("Original Value:" + name);
		
		System.out.println("*************************************");
		System.out.println("StringBuffer is Mutable");
		StringBuffer aa = new StringBuffer("Kaspar");
		System.out.println("Appending a name to Original: " + aa.append("Mary"));
		System.out.println("Original Value:" + aa);
		
		//StringBuffer methods
		//Reserve
		System.out.println("Reversed name:" + aa.reverse());
		//Replace
		StringBuffer replaceThis = new StringBuffer("Kaspar");
		System.out.println("Replace :" + replaceThis.replace(0, 2, "Mary"));
		//Delete
		StringBuffer deleteThis = new StringBuffer("Kaspar");
		System.out.println("Delete :" + deleteThis.delete(0, 2));
		//insert
		StringBuffer insertThis = new StringBuffer("Anand");
		System.out.println("Insert :" + insertThis.insert(5, "Kaspar"));
		//capacity => Default 16
		StringBuffer findCapacity = new StringBuffer("Helloworld we we wewe");
		System.out.println(findCapacity.capacity());
		//also, charAt, subSring, length -> methods also possible
		
		System.out.println("***********Increase string size using StringBuffer************");
		//Increase string size using StringBuffer
		StringBuffer str = new StringBuffer("Mary");
		System.out.println(str.length());
		str.setLength(6);
		System.out.println(str.length());
		
		System.out.println("***********Increase string size using StringBuilder************");
		//Increase string size using StringBuffer
		StringBuilder str1 = new StringBuilder("Honey");
		System.out.println(str1.length());
		str1.setLength(15);
		System.out.println("After incresed string size using setLength:" + str1 + "fdf");
		System.out.println(str1.length());
		
		String strs = "StringJavaAndJavaStringMethodsJava";
        String strToFind = "Java";
        int count = 0, Index = 0;
        
        while ((Index = strs.indexOf(strToFind, Index)) != -1 ){
  
            System.out.println("Java found at index: " + Index);
            count++;
            Index++;
             
        }
        System.out.println("Total occurances of java" + count + Index);
	}

}
