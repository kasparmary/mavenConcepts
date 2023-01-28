package MustKnowJavaConcepts;

public class JavaMainMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Defaull main method");
		main(1);
	}
	public static void main(int[] args){
        System.out.println("Overloaded Integer array Main Method");
    }
    public static void main(char[] args){
        System.out.println("Overloaded Character array Main Method");
    }
    public static void main(double[] args){
        System.out.println("Overloaded Double array Main Method");
    }
    public static void main(float args){
        System.out.println("Overloaded float Main Method");
    }

}
