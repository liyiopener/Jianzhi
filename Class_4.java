package niuke;

public class Class_4 {
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
       return reConstructBinaryTree(pre, in, 0, pre.length-1, 0, pre.length-1);
	}
	public int findIndex(int[] arr,int a){
		int i=0;
		while(i<arr.length){
			if(a==arr[i]){
				return i;
			}
			else i++;
		}
		return 0;
	}
	public TreeNode reConstructBinaryTree(int[] pre, int[] in,int pst,int pend,int ist,int iend) {
		if(pst>pend || ist>iend) return null;
        int num=pre[pst];
		TreeNode tn=new TreeNode(num);
		int current=findIndex(in,num);
		tn.left=reConstructBinaryTree(pre, in, pst+1, pst+current-ist, ist, current-1);
		tn.right=reConstructBinaryTree(pre, in, pst+current-ist+1, pend, current+1, iend);
		return tn;
	}
}


