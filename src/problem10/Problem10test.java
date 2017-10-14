package problem10;

/**
 * @author Yu
 * @date 2017年10月12日
 */
public class Problem10test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		System.out.println(numOf1(n));
	}

	private static int numOf1(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = (n - 1) & n;
		}
		return count;
	}

}
