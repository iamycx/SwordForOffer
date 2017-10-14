package problem20;

/**
 * @author Yu
 * @date 2017年10月13日
 */
public class Problem20test {

	public static void main(String[] args) {
		int[][] numbers = { { 2 } };
		int col = numbers[0].length, row = numbers.length;
		printMatrixClockwisely(numbers, col, row);
	}

	private static void printMatrixClockwisely(int[][] numbers, int col, int row) {
		if (numbers == null || col < 0 || row < 0) {
			return;
		}
		int start = 0;
		while (col > start * 2 && row > start * 2) {
			printMatrixCircle(numbers, start);
			start++;
		}
	}

	private static void printMatrixCircle(int[][] array, int start) {
		for (int i = start; i < array[0].length - start; i++) {
			System.out.println(array[start][i]);
		}
		if (array.length - 1 - start > start) {
			for (int i = start + 1; i < array.length - start; i++) {
				System.out.println(array[i][array[0].length - 1 - start]);
			}
		}
		if (array[0].length - start - 1 > start && array.length - start - 1 > start) {
			for (int i = array.length - start - 1; i > start; i--) {
				System.out.println(array[array.length - start - 1][i]);
			}
		}
		if (array.length - 1 - start > start && array[0].length - 1 - start > start) {
			for (int i = array.length - start - 1; i > start; i--) {
				System.out.println(array[i][start]);
			}
		}
	}
}
