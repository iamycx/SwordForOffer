package problem14;

/**
 * @author Yu
 * @date 2017年10月13日
 */
public class Problem14test {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 4, 3, 5 };
		reOrderOddEven(arr, arr.length);
	}

	private static void reOrderOddEven(int[] arr, int length) {
		if (arr == null || length == 0) {
			return;
		}
		int m = 0, n = length - 1;
		while (m < n) {
			while ((m < n) && (arr[m] % 2 != 0)) {
				m++;
			}
			while ((m < n) && (arr[n] % 2 == 0)) {
				n--;
			}
			if (m < n) {
				int temp = arr[n];
				arr[n] = arr[m];
				arr[m] = temp;
			}
		}
		for (int k : arr)
			System.out.print(k);

	}

}
