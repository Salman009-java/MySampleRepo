package simpletest;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo.findOnesOccurance(new int[] {5431151});
	}
	
	public static void findOnesOccurance(int[] no) {
		
		for(int i=0;i<no.length;i++) {
			int count=0;	
			if(no[i]==1) {
				count++;
				System.out.println("total count of 1's is :"+count);	
				break;
			}
			
		}
	}
	
}
