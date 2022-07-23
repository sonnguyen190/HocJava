package main;

public class UserController {
	private MessageService message;
	public UserController(MessageService messageService) {
        this.message = messageService;
    }
	public void send() {
		message.sendMessage("Hello Dependency injection pattern");
	    }
}
