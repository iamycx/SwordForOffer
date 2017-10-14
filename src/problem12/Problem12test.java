package problem12;

/**
 * @author Yu
 * @date 2017年10月13日
 */
public class Problem12test {

	public static void main(String[] args) {
		int n = 2;
		print1ToMaxOfNDigits(n);
	}

	// 遍历将n位数字排列组合
	private static void print1ToMaxOfNDigits(int n) {
		if (n <= 0)
			return;
		char[] number = new char[n + 1];
		number[n] = '\0';// 字符串的最后一位是'\0' 空格
		for (int i = 0; i < 10; i++) {
			number[0] = (char) (i + '0');
			print1ToMaxOfNDigitsRecursively(number, n, 0);
		}

	}

	private static void print1ToMaxOfNDigitsRecursively(char[] number, int length, int index) {
		if (index == length - 1) {
			printNum(number);
			return;
		}
		for (int i = 0; i < 10; i++) {
			number[index + 1] = (char) (i + '0');
			print1ToMaxOfNDigitsRecursively(number, length, index + 1);
		}
	}

	private static void printNum(char[] number) {
		boolean isBegining0 = true;
		int len = number.length;
		for (int i = 0; i < len; i++) {
			if (isBegining0 && number[i] != '0')
				isBegining0 = false;
			if (!isBegining0)
				System.out.print(number[i]);
		}
	}

}
