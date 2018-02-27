package niuke;

import java.util.Scanner;

import org.junit.Test;

public class class_8 {
	public int JumpFloor(int target) {
		if (target < 3)
			return target;
		int n_2 = 1, n_1 = 2, count = 0;
		for (int i = 2; i < target; i++) {
			count = n_2 + n_1;
			n_2 = n_1;
			n_1 = count;
		}

		return count;
	}

	@Test
	public void test() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int count = JumpFloor(sc.nextInt());
			System.out.println(count);
		}
	}
}
