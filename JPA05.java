import java.util.*;
public class JPA05 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        test();
        test();
    }
    
    static void test() {
		System.out.println("Enter an integer:");
		int num = input.nextInt();
		String str = num + "是";
		if(num % 2 != 0 && num % 3 != 0 && num % 6 != 0) {
			System.out.println("不是2、3、6的倍數");
		}
		else {
			if(num % 2 == 0) {
				str += "2、";
			}
			if(num % 3 == 0) {
				str += "3、";
			}
			if(num % 6 == 0) {
				str += "6、";
			}
			if(str.charAt(str.length()-1) == '、') {
				str = str.substring(0, str.length()-1);
			}
			System.out.println(str + "的倍數");
		}
    }
}