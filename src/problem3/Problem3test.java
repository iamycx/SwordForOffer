package problem3;

/**
 * @author Yu
 * @date 2017年10月12日
 */
public class Problem3test {

	/* 一个二维数组，每一行从左到右递增，每一列从上到下递增． 输入一个二维数组和一个整数，判断数组中是否含有整数 */

	private static boolean Find(int[][] arr, int n) {
		if (arr == null) {
			return false;
		}
		int row = 0, col = arr[0].length - 1;
		while (row < arr.length && col >= 0) {
			if (arr[row][col] == n) {
				return true;
			}
			else if (arr[row][col] > n) {
				col--;
			} else {
				row++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] testarray = new int[4][4];
		testarray[0][0] = 1;
		testarray[0][1] = 2;
		testarray[0][2] = 8;
		testarray[0][3] = 9;
		testarray[1][0] = 2;
		testarray[1][1] = 4;
		testarray[1][2] = 9;
		testarray[1][3] = 12;
		testarray[2][0] = 4;
		testarray[2][1] = 7;
		testarray[2][2] = 10;
		testarray[2][3] = 13;
		testarray[3][0] = 6;
		testarray[3][1] = 8;
		testarray[3][2] = 11;
		testarray[3][3] = 15;
		System.out.println(Find(testarray, 12));
	}
}
