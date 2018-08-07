package java8_7;

public class Test_04 {

	public static void main(String[] args) {
	  int[]arr=new int[]{2,3,45,666,0};
	  turnnum(arr);
	  System.out.println(seach(arr,0)+1);
	}
	static int seach(int[]arr,int num){
		int max=arr.length-1;
		int min=0;
		while(min<=max){
			int mid=(max+min)/2;
			if(arr[mid]>num){
				max=mid-1;
			}
			else if(arr[mid]<num){
				min=mid+1;
			}
			else if(arr[mid]==num)
				return mid;
		}
		return -1;
	}
    static void turnnum(int[]arr){
    	for(int i=0;i<arr.length-1;i++){
    		for(int j=i+1;j>0;j--){
    			if(arr[j-1]>arr[j])
    				turn(arr,j-1,j);
    			else 
    				break;
    		}
    	}
    }
    static void turn(int[]arr,int i,int j){
    	int num=arr[i];
    	arr[i]=arr[j];
    	arr[j]=num;
    }
}

