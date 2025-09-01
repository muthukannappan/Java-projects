public class Max_array {
    public static void main(String[] args) {
		int[] arr= {10,20,4,45,99,6};
		int max=arr[0];
		 for (int i=1;i<arr.length;i++) {
			 if(arr[i]>max) {
				 max=arr[i];
			 }
		 }
		 System.out.println(max);
    }
}
