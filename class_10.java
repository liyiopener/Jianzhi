package niuke;

import org.junit.Test;

public class class_10 {
	public int RectCover(int target) {
		if (target ==0) return 0;
		if (target == 1 || target == 2)
			return target;
		else {
			return RectCover(target - 1) + RectCover(target - 2);
		}
	}
	@Test
	public void test(){
		int n =5;
		System.out.println(RectCover(n));
	}
}
