package problem9;

/**
 * @author Yu
 * @date 2017年10月12日
 */
public class Problem9test {

	/* 斐波那契数列,跳台阶多少种跳法也是斐波那契数列 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println(fibonacciPlus(n));
	}

	// 效率低，重复计算
	@SuppressWarnings("unused")
	private static long fibonacci(int n) {
		long res = 0;
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			res = fibonacci(n - 1) + fibonacci(n - 2);
		}
		return res;
	}

	private static long fibonacciPlus(int n) {
		long res = 0;
		long fibOne = 1;
		long fibTwo = 0;
		if (n == 0) {
			return fibTwo;
		} else if (n == 1) {
			return fibOne;
		} 
		for(int i=2;i<=n;i++){
			res = fibOne+fibTwo;
			fibTwo = fibOne;
			fibOne = res;
		}
		return res;
	}
}
