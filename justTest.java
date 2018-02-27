package niuke;

import java.util.Date;

import org.junit.Test;

public class justTest {
   @Test
   public void testMathceil(){
	  long n=9223372036854775807L;
	  long start=System.nanoTime(); //获取开始时间  
	    //要测试的程序或方法  
	  System.out.println(n/2);
	  long end=System.nanoTime();
	  System.out.println("程序运行时间： "+(end-start)+"ns");  
	  System.out.println("*************************");
	  long start1=System.nanoTime(); //获取开始时间  
	    //要测试的程序或方法  
	  System.out.println(n >> 1);
	  long end1=System.nanoTime();
	  System.out.println("程序运行时间： "+(end1-start1)+"ns");  
   }
   
}
