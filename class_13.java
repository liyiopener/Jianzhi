package niuke;

import org.junit.Test;

public class class_13 {
	//快排思想-->错误-->非稳定排序（顺序会错乱）
	public void reOrderArray(int[] array) {
		int i = 0, j = 0, l = array.length - 1;
		while (i < l && j < l) {
			while (i < l) {
				if ((array[i] & 1) == 0)
					break;
				else
					i++;
			}
			while (j < l) {
				if ((array[j] & 1) != 0)
					break;
				else
					j++;
			}
			if (i >= j) {
				j++;
			} else {
			  if((array[j]&1)==0) break;
			  int tmp = array[j];
			  int k=j;
			  while(k>i){
				  array[k] = array[k-1];
				  k--;
			  }
			  array[i] = tmp;
			}
		}
	}
	
	/**
	 * 
	public void reOrderArray2(int [] a) {
    if(a==null||a.length==0)
        return;
    int i = 0,j;
    while(i<a.length){
        while(i<a.length&&!isEven(a[i]))
            i++;
        j = i+1;
        while(j<a.length&&isEven(a[j]))
            j++;
        if(j<a.length){
            int tmp = a[j];
            for (int j2 = j-1; j2 >=i; j2--) {
                a[j2+1] = a[j2];
            }
            a[i++] = tmp;
        }else{// 查找失敗
            break;
        }
    }
}
boolean isEven(int n){
    if(n%2==0)
        return true;
    return false;
}

	 */
	@Test
	public void test() {
      int[] a={1,3,5,7,2,4,6};
      reOrderArray(a);
      for(int b:a)
    	  System.out.println(b);
	}
}
