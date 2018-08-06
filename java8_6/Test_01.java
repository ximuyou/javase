package java8_6;

public class Test_01 {
      public static void main(String[] args) {
	  weekday day=weekday.Sun;//枚举类个数固定，不能使用new 
	 System.out.println("是"+day.getDay());
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
	//枚举类默认有假的构造方法，即使在定义构造方法，也只能是private
	//枚举类可以有属性，属性默认为全局常量，
	Sun("周日",0),Mon("周一",1),Tues("周二",2),Wednes("周三",3),Turse("周四",4),Fri("周五",5),Satur("周六",6);
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