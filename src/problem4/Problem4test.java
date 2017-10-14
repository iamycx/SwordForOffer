package problem4;
/** 
 * @author Yu
 * @date 2017年10月12日
 */
public class Problem4test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "We are funny.";
		System.out.println(replace_blank(res));
	}

	private static String replace_blank(String res) {
		res = res.replaceAll(" ", "%20");
		return res;
	}

}
