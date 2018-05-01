package sorular;

public class aharfi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<6;i++){
			for(int j=0;j<4;j++){
				
				if((i==0 || i==2) && j<4){
					System.out.print(" * ");
				}else if((j==0 || j==3) && i<6){
					System.out.print(" * ");
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		
	}

}
