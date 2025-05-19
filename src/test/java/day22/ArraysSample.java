package day22;

import java.util.Scanner;

public class ArraysSample {

	
	public void add() {
		
		System.out.println("hello");
	}
	
	public boolean sub() {
		
		System.out.println("Hi");
		if(1==2) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArraysSample obj=new ArraysSample();
		obj.add();
		boolean str =obj.sub();
		System.out.println(str);
		
		int a =10;
		float b= 10.2f;
		
		int c = a + (int)b;
		System.out.println(c);
		
		
		
		
		Scanner sc = new Scanner(System.in);
//		int[] arr = {10,20,30,40,50};
//		
//		int[] arr1 = new int[5];
////		arr[0]=10;
////		arr[1]=20;
//		
//		for(int i=0;i<arr.length;i++) {
//			
//			arr[i]=sc.nextInt();
//			
//		}
//		
//		for(int i=0; i<arr.length;i++) {
//			
//			System.out.println(arr[i]);
//		}
//		
		int rows=2;
		int columns=2;
		
		int[][] matrix = {
				{1,2,3},   //6
				{4,5,6},  // 15
				{7,8,9}  // 24
		};
		
//		int[][] arr2= new int[rows][columns];
//		
//		for(int i=0;i<rows;i++) {
//			
//			for(int j=0;j<columns;j++) {
//				
//				arr2[i][j]=sc.nextInt();
//			}
//		}
		
		for(int i=0;i<matrix.length;i++) {
			
			int rowSum=0;
			
			for(int j=0;j<matrix.length;j++) {
				
				rowSum += matrix[i][j];
			}
			System.out.println("Sum of row "+(i +1)+": "+rowSum);
		}
		
	}

}
