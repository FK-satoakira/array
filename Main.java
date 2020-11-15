package sample_2;

public class Main {

	public static void main(String[] args) {
		Engineer e = new Engineer();
		e.hello();
		System.out.println();

		int[] num = {10,20,30};
		int[] num2 = num.clone();
//		System.out.println(num[0]);
//		num[0] = 11;

		int[][] array1 = {{10,20,30},{100,200,300,400}};
//		int[][] array2 = new int[][] {{2,3,4},null};
//		for (int i = 0; i < array1.length; i++) {
//			for (int j = 0; j < array1[i].length; j++) {
//				array2[i][j]=array1[i][j];
//			}
//		}
		int[][] h = {{1,2},null};
		System.out.println(h[0][0]);
		int[][] array2 = {};
//		System.out.println(num[0]);
//		System.out.println(num2[0]);
		array2 = testclone(array1);
		System.out.println(array2[0][0]);
		System.out.println(array1[0][0]);


//		int[][][] super_b = testclone(super_a);
//		for (int i = 0; i < super_b.length; i++) {
//			for (int j = 0; i < super_b[i].length; j++) {
//				for (int g = 0; g < super_b[i][j].length; g++) {
//					super_b[i][j][g] = super_b[i][j][g]*2;
//					System.out.println("b"+super_b[i][j][g]);
//					System.out.println("a"+super_a[i][j][g]);
//
//				}
//			}
//		}


		int[] a = {1,2};
		int[] b = a.clone();
	}
	public static int[][] testclone(int[][] array) {
		int[][] array2 = new int[array.length][];
		for (int i = 0; i < array.length; i++) {
//			array2[i] = array[i].clone();
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
				System.out.println(array2[i]);
				array2[i][j] = array[i][j];
			}
		}
		return array2;
	}
//	public static int[][][] testclone(int[][][] array){
//		int[][][] array3 = new int[array.length][2][];
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				System.out.println(array[i][j]);
//				array3[i][j] = array[i][j].clone();
//			}
//		}
//		return array3;
//	}
	public static void testclone(int[][] array1, int[][] array2) {
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i].clone();
		}
	}


}
