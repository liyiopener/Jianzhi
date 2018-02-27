package niuke;

public class Class_1 {
	public boolean Find(int target, int[][] array) {
		int i = array.length - 1;
		int j = 0;
		boolean flag =false;
		while (j <= array[0].length - 1 && i >= 0) {
           if((target - array[i][j])==0) {
        	   flag = true;
        	   break;
           }
           if((target - array[i][j])>0){
        	   j++;
           }
           else{
        	   i--;
           }
           
		}
		return flag;
	}
}
