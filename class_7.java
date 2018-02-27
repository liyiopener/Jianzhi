package niuke;

import java.util.Scanner;

import org.junit.Test;

public class class_7 {
	@Test
	public void test(){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			System.out.println(Fibonacci((sc.nextInt())));
		}
	}
	public int Fibonacci(int n) {
		if(n==0) return 0;
		if(n==1 || n==2) return 1;
		else return Fibonacci(n-1)+Fibonacci(n-2);
    }
	public int Cal(int n){
		if(n==1) return 1;
		if(n==2) return 1;
		else return Cal(n-1)+Cal(n-2);
	}
}
