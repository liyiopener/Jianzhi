package niuke;

import org.junit.Test;

public class Class_11 {
	public int NumberOf1(int n) {
		int count=0;
		while(n!=0){
			if((n&1)!=0)
				count++;
			n=n >>> 1;
		}
		return count;
    }
	@Test
	public void test(){
		int n =-3;
		System.out.println(NumberOf1(n));
	}
}
