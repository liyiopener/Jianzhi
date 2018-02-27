package niuke;

import org.junit.Test;

public class class_6 {
	@Test
	public void test() {
		int[] a = {3,3,3,3,3,9,9,9,93,3,3,3};
		System.out.println(minNumberInRotateArray(a));
	}

	public int minNumberInRotateArray(int[] array) {
		if (array.length == 0)
			return 0;
		else {
			int index= find(array, 0, array.length - 1);
			return array[index];
		}
	}

	public int find(int[] a, int left, int right) {
		if (left == right-1)
			return (a[left]-a[right])>0?right:left;
		int mid =left+(right-left)/2;
		if (a[mid] > a[right])
			return find(a, mid, right);
		if (a[mid] < a[right])
			return find(a, left, mid);
		else return find(a,left+1,right);
	}
}