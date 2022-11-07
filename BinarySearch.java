package practise;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] num= {0,1,2,3,4,5,6,7,8,9};
		int end=num.length-1;
		int start=0;
		int result=8;
		int mid=0;
		while(start<=end) {
			 mid=(start+end)/2;
			if(result==num[mid])	{
				System.out.println(mid);
				break;
			}
			else if(result>num[mid]) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		
	}

}
