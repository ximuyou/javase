package java8_6;

public class Test_01 {
      public static void main(String[] args) {
	  weekday day=weekday.Sun;//ö��������̶�������ʹ��new 
	 System.out.println("��"+day.getDay());
	}
      static void put(weekday day){
    	  switch(day){
    	  case Sun:System.out.println(day.getDay());break;
    	  case Mon:System.out.println(day.getDay());break;
    	  case Tues:System.out.println(day.getDay());break;
    	  case Wednes:System.out.println(day.getDay());break;
    	  case Turse:System.out.println(day.getDay());break;
    	  case Fri:System.out.println(day.getDay());break;
    	  case Satur:System.out.println(day.getDay());break;
    	  }
    	  
      }
}
enum weekday{
	//ö����Ĭ���мٵĹ��췽������ʹ�ڶ��幹�췽����Ҳֻ����private
	//ö������������ԣ�����Ĭ��Ϊȫ�ֳ�����
	Sun("����",0),Mon("��һ",1),Tues("�ܶ�",2),Wednes("����",3),Turse("����",4),Fri("����",5),Satur("����",6);
	private String day;
	private int  i;
	private weekday(String day,int i){
		this.day=day;
		this.i=i;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
}