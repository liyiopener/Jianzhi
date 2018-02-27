package niuke;

import org.junit.Test;

public class class_9 {
	/*
	 * public int JumpFloorII(int target) { if(target == 1) return 1; else{ int
	 * sum = 0; for(int temp = target - 1 ; temp > 0 ; temp--){
	 * System.out.println
	 * ("1+JumpFloorII("+(target-temp)+")+"+"JumpFloorII("+temp+")"); sum =
	 * 1+JumpFloorII(target-temp)+JumpFloorII(temp); } return sum; } }
	 */
	public int JumpFloorII(int target) {
		if(target==0) return 1;
		if(target==1) return 1;
		if(target==2) return 2;
		else{
			return 2*JumpFloorII(target-1);
		}
	}

	@Test
	public void test09() {
		int test = 5;
		int sum = JumpFloorII(test);
		System.out.println(sum);
	}
}
