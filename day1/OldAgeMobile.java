package week1.day1;

public class OldAgeMobile {
	
	String MobileName = "Nokia mini";
	char mobileLogo = 'N';
	short noOfMobilePiece = 7;
	int modelNumber = 34567;
	long mobileEmiNumber = 12312343432L;
	float mobilePrice = 9999.999f;
	boolean isDamaged = false;
	

	public static void main(String[] args) {
		
OldAgeMobile miniMobile = new OldAgeMobile();

System.out.println("Mobile Name:" + miniMobile.MobileName);
System.out.println("Mobile Logo:" + miniMobile.mobileLogo);
System.out.println("No.Of Mobile Piece:" + miniMobile.noOfMobilePiece);
System.out.println("Model Number:" + miniMobile.modelNumber);
System.out.println("Mobile EMI NUmber:" + miniMobile.mobileEmiNumber);
System.out.println("Mobile Price:" + miniMobile.mobilePrice);
System.out.println("Is Damaged?" + miniMobile.isDamaged);
	}

}
