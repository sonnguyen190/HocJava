package main;

public class SmsService implements MessageService{
	

	@Override
	public void sendMessage(String message) {
		System.out.println("Sms Service :"+ message);
		
	}
}
