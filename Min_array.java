public class Min_array {
	public static void main(String[] args) {
		int[] arr= {10,20,4,45,99,6};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println(min);
	}
	
//	public static void main(String [] args) {
//		int[] arr= {10,20,4,45,99,6};
//		int lmin=arr[0];
//		
//		int j=arr.length-1;
//		int rmin=arr[j];
//		
//		for (int i=1;i<arr.length;i++) {
//			if(arr[i]<lmin) lmin=arr[i];
//			j--;
//			if(arr[j]<rmin) rmin=arr[j];
//			
//			if(i>=j) {
//			    System.out.println(Math.min(lmin,rmin));
//			    break;
//			}
//		}
//		
//	}

}
