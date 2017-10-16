package problem28;
/** 
 * @author Yu
 * @date 2017年10月13日
 */
public class Problem28test {

	public static void main(String[] args) {
		String str = "abc";
		permutation(str);
	}

	private static void permutation(String str) {
		if(str==null)
			return;
		char[] ch = str.toCharArray();
		int p=0;
		System.out.println(ch);
		
		char temp1 = ch[p];
		ch[p] = ch[++p];
		ch[p] = temp1;
		while(!String.valueOf(ch).equals(str)){
			System.out.println(ch);
			if(p==ch.length-1){
				char temp2 = ch[p];
				ch[p] = ch[0];
				ch[0] = temp2;
				p=0;
			}else{
				char temp2 = ch[p];
				ch[p] = ch[++p];
				ch[p] = temp2;
			}

		}
		
	}

}
