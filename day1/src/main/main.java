package main;

public class main {
	public static void main(String[] args) {
		MessageService messageService = new SmsService();
		UserController userController = new UserController(messageService);
		userController.send();
	}
}
