package week1.day1;

public class Mobile {
	
	public void makeCall() {
		
		System.out.println("This is used to make calls");

	}
	
	public void sendMsg() {
		
		System.out.println("This is used to send message");

	}

	public static void main(String[] args) {
		
		Mobile firstMobile = new Mobile();
		
		firstMobile.makeCall();
		firstMobile.sendMsg();

	}

}
