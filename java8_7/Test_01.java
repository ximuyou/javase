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
			System.out.println("������һ��0-1�������"+d);
			int i=fan.nextInt();
			System.out.println("����һ�����������"+i);
			//������С�������������
			i=fan.nextInt(100);
			System.out.println("����һ��0��100�������"+i);
			d=Math.random();
			System.out.println("0��1֮��������"+d);
			String u=UUID.randomUUID().toString();
			System.out.println("uuid���ɵ�128λ��������"+u);
			
		}
}
