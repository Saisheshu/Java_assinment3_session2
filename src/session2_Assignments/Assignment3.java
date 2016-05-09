package session2_Assignments;

public class Assignment3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int Max=5;
		for(int i=1;i<=9;i++){
			if(i<=5){
				Max=i;
			}else{
				Max=10-i;;
			}
			for(int k=1;k<=Max;k++){
				System.out.print(k);
			}
			System.out.print("\n");
		}
	}

}
