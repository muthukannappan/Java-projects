
public class Min_and_Max {
	public static void main(String[] args) {
		int[] arr = {12, 45, 7, 99, 23, 1, 88, 34, 76, 5, 120, 54, 3, 67, 90};
		int max,min;
		int i=0;
		if(arr.length%2==0) {
			if(arr[i]>arr[i+1]) {
			 max=arr[i];
			 min=arr[i+1];
			}else {
				max=arr[i+1];
				min=arr[i];
			}
		     i=2;
		}else {
			min=max=arr[i];
		    i=1;
		}
		    
		while(i<arr.length) {
		    if(arr[i]>arr[i+1]) {
				 if(arr[i]>max) max=arr[i];
				 if(arr[i+1]<min)min=arr[i+1];
			}else {
				if(arr[i+1]>max) max=arr[i+1];
				if(arr[i]<min) min=arr[i];
			}
		    i+=2;
			
		}
		System.out.println("max :"+max+"min :"+min);
		
		}
}
