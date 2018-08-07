package java8_7;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class Test_01 {
        public static void main(String[] args) {
			String str=new String("Hello world");
			ThreadLocalRandom t=ThreadLocalRandom.current();
			Random fan=new Random();
			System.out.println(t.nextInt(3,56));
			String str0=str.replace('w', 'W');
			System.out.println(str0);
			
			double d=fan.nextDouble();
			System.out.println("产生的一个0-1随机数是"+d);
			int i=fan.nextInt();
			System.out.println("产生一个随机的整数"+i);
			//包括最小数不包括最大数
			i=fan.nextInt(100);
			System.out.println("产生一个0到100的随机数"+i);
			d=Math.random();
			System.out.println("0到1之间的随机数"+d);
			String u=UUID.randomUUID().toString();
			System.out.println("uuid生成的128位的数字是"+u);
			
		}
}
