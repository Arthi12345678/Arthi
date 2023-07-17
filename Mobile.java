package week1.day1;

public class Mobile {
	public void sendMessage()
	{
		System.out.println("sending message");
	}
	public void shareDocument()
	{
		System.out.println("sending message");
	}
	public void makeCall()
	{
	System.out.println("making a call");
	}
	public static void main(String[] args) {
		Mobile mymobile=new Mobile();
		mymobile.sendMessage();
		mymobile.shareDocument();
		mymobile.makeCall();
 
	}

}
