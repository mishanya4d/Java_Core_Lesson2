package lesson1;

public class Application {

	public static void main(String[] args) {
	
		int a=5;
		long b=8l;
		boolean g=false;
		char k=3;
		double t=2.3;
		short w=3002;
		float f=222f;
		byte c=127;
		
		
		
	
		System.out.println("Byte Max= "+ Byte.MAX_VALUE);
		System.out.println("Byte Min= "+ Byte.MIN_VALUE);
		System.out.println("Int Max= "+ Integer.MAX_VALUE);
		System.out.println("Int Min= "+ Integer.MIN_VALUE);
		System.out.println("Double Max= "+ Double.MAX_VALUE);
		System.out.println("Double Min= "+ Double.MIN_VALUE);
		System.out.println("Short Max= "+ Short.MAX_VALUE);
		System.out.println("Short Min= "+ Short.MIN_VALUE);
		System.out.println("Float Max= "+ Float.MAX_VALUE);
		System.out.println("Float Min= "+ Float.MIN_VALUE);
		System.out.println("Long Max= "+ Long.MAX_VALUE);
		System.out.println("Long Min= "+ Long.MIN_VALUE);
		System.out.println("Double Max= "+ Double.MAX_VALUE);
		System.out.println("Double Min= "+ Double.MIN_VALUE);
	
		boolean r=true;
		boolean q=false;
		System.out.println("Boolean 1 "+ r);
		System.out.println("Boolean 2 "+ q);
		
		
		int min=0;
		int max=0;
		int arr[]={-1,4,8,2,3,-6,12,16,-18,43};
		
		
		for (int i=0; i < arr.length; i++) {
		    if (arr[i] < min) {  
		        min = arr[i];
		    }
		}
		for (int i=0; i < arr.length; i++) {
		    if (arr[i] > max) {  
		        max = arr[i];
		    }
		}
	    System.out.println("Min "+ min);
		System.out.println("Max " + max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}
