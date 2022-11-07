package practise;

public class BubbleSort {
	
	public void bublesort(int[] size) {

		int n=size.length;

		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(size[j]>size[j+1]) {
				int temp=size[j];
				size[j]=size[j+1];
				size[j+1]=temp;
				}
			}
			
		}	}
}
