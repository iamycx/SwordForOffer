package problem11;

/**
 * @author Yu
 * @date 2017年10月13日
 */
public class Problem11test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int n = -1;
		double m = 2;
		System.out.println(power(m, n));

	}

	private static double power(double m, int n) throws Exception {
		double res = 0.0;
		if (equal(m, 0.0) && n < 0) {
			throw new Exception("0的负指数幂无意义");
		}
		if (equal(n, 0)) {
			return 1.0;
		}
		if (n < 0) {
			res = powerWithExponent(1.0 / m, -n);
		} else {
			res = powerWithExponent(m, n);
		}
		return res;
	}

	private static double powerWithExponent(double m, int n) {
		double ss = 1.0;
		for (int i = 0; i < n; i++) {
			ss = ss * m;
		}
		return ss;
	}

	private static boolean equal(double m, double d) {
		if ((m - d < 0.0000001) && (d - m < 0.0000001)) {
			return true;
		} else {
			return false;
		}
	}

}
