package practise;

public class BubbleOSrtImp {

	public static void main(String[] args) {
		int[] num= {3,1,6,8,9,0,6};
		int find=3;
		
		BubbleSort b=new BubbleSort();
	    b.bublesort(num);
	    int start=num[0];
	    int end=num.length;
	  
	 while(start<=end) {
		  int mid=(start+end)/2;
			if(find==num[mid]) {
				System.out.println(mid);
				break;
				
			}else if(find>num[mid]) {
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		
	}

}
