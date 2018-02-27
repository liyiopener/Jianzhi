# 剑指offer
- - -
## 反转列表
```java
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
```
## 两个栈实现一个队列
**注意:** _**stack的size会随着push和pop而改变**_
``` java
public class Solution {
    //stack1做入队，stack2做出队
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        //若两栈为空，直接放在出队栈
        if(stack1.empty() && stack2.empty())
          stack2.push(node);
        else
          stack1.push(node);
      }
      
      public int pop() {
        if(stack2.size()!=0)
          return stack2.pop();
        else{
          while(!stack1.empty()){
            stack2.push(stack1.pop());
          }
          return stack2.pop();
        }
      }
}
```
## 青蛙跳
```java
package niuke;

import org.junit.Test;

public class class_8 {
   public int JumpFloor(int target) {
     int count=(int) Math.ceil(target/2.0);
     int sumStep=0;
     if(target%2==0){
       for(int i=0;i<count;i++){
         sumStep+=calPossible(i, count)*calPossible(i*2, count-i+1);
       }
       return sumStep;
     }
     else{
       for(int i=0;i<count;i++){
         sumStep+=calPossible(i+1, count)*calPossible(i*2+1, count-i);
       }
       return sumStep;
     }
      }
   public int calPossible(int n,int m){    
     return calCheng(m)/(calCheng(n)*calCheng(m-n));
   }
   public int calCheng(int n){
    if(n==0 || n==1) return 1;
    else
      return calCheng(n-1)*n;
   }
   @Test
   public void test(){
        int d=JumpFloor(3);
        System.out.println(d);
   }
   
}

```


