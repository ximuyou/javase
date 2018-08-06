package java8_6;
import java.util.Random;
public class Test_02 {
	public static void main(String[] args) {
		String str = new String("Hello world");
		// String str="Hello world";
		System.out.println(str + " " + str.length());
		char[] arr = str.toCharArray();
		for (char temp : arr) {
			System.out.print(temp + " ");
		}
		System.out.println();
		String str1=new String(arr);
		System.out.println(str1);
		if(str==str1)
			System.out.println("nothing is impossible");
		else 
			System.out.println("have a nice day");
		if(str.equals(str1))
            System.out.println("hehe");	
		//生成一个新的字符串需要再定义一个字符串类型变量；
		String str3=str.substring(1,3);
		System.out.println(str3);
		Random ran=new Random();
		System.out.println(ran);
	}
}
