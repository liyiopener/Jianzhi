package niuke;

import org.junit.Test;

public class class_12 {
	 public double Power(double base, int exponent) {
	       /* if(exponent==0) return 1;
	        if(exponent >0) return base*Power(base,exponent-1);
	        else{
	        	int num = -exponent;
	        	return 1/Power(base, num);
	        }*/
		 int n = Math.abs(exponent);
	        double result = 1.7976931348623157E308;
	        if (n == 0)
	            return 1.0;
	        if (n == 1)
	            return base;
	         
	        result = Power(base, n >> 1);  //result=Power(base,n/2)
	        result *= result;
	        //判断是否为奇数
	        if ((n & 1) == 1) // 如果指数n为奇数，则要再乘一次底数base
	            result *= base;
	        if (exponent < 0) // 如果指数为负数，则应该求result的倒数
	            result = 1 / result;
	         
	        return result;

	  }
	 @Test
	 public void test(){
		 long start=System.nanoTime(); //获取开始时间  
		    //要测试的程序或方法  
		  System.out.println(Power(96,3));
		  long end=System.nanoTime();
		  System.out.println("程序运行时间： "+(end-start)+"ns");   
		  
	 }
}
