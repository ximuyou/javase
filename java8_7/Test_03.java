package java8_7;

public class Test_03 {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 45, 666, 0 };
		maopao m = new maopao();
		charu c=new charu();
		xuanze x = new xuanze();
		m.setArr(arr);
		x.setArr(arr);
		c.setArr(arr);
		getmessiage(m, arr);
		getmessiage(x, arr);
        getmessiage(c, arr);
	}

	static void getmessiage(circle c, int[] arr) {
		c.cir();
		for (int temp : arr) {
			System.out.print(temp + " ");
		}
		System.out.println();
	}
}

interface circle {
	void cir();
}

class maopao implements circle {
	private int[] arr;

	public void cir() {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int n = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = n;
				}

			}
		}
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

}

class xuanze implements circle {

	private int[] arr;

	public void cir() {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length ; j++) {
				if (arr[i] < arr[j]) {
					int n = arr[i];
					arr[i] = arr[j];
					arr[j] = n;
				}
			}
		}
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

}
class charu implements circle{
	private int[]arr;

	public void cir() {
        for(int i=0;i<arr.length-1;i++){
        	for(int j=i+1;j>0;j--){
        		if(arr[j-1]>arr[j]){
        			int n=arr[j-1];
        			arr[j-1]=arr[j];
        			arr[j]=n;
        		
        		}
        		else break;
        	}
        }
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}
}
