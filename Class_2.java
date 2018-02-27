package niuke;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class Class_2 {
	//字符逐一比对
	 public String replaceSpace(StringBuffer str) {
		    for(int i=0;i<str.length();i++){
		    	if(str.charAt(i)==' ')
		    		str.replace(i,i+1, "20%");
		    }
	    	return str.toString();
	    }
	 //使用正则表达式
	 public String replaceSpaceByRegex(StringBuffer str) {
		    String regex=" ";
		    String strNew=str.toString();
		    Pattern p =Pattern.compile(regex);
		    Matcher m= p.matcher(strNew);
		    strNew = m.replaceFirst("%20");
		    return strNew;
	    }
	 @Test
	 public void test(){
		 StringBuffer ac=new StringBuffer("we are your best ");
		 //System.out.println(replaceSpace(ac));
		 System.out.println(replaceSpaceByRegex(ac));
	 }
}
