public class JPA106 {
	public static void main(String []args) {
		double res = 0.0;
		double []nums = {-3.2, -2.1, 0, 2.1};
		for(int index=0;index<nums.length;index++) {
			res = 3 * Math.pow(nums[index], 3) + 2 * nums[index] - 1;
			System.out.printf("f(%s) = %.4f\r\n", nums[index], res);
		}
	}
}