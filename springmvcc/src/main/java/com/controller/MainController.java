package com.controller;





import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;




@Controller //Controller là nơi tiếp nhận request(yêu cầu)
@RequestMapping("/main") //đường dẫn để đi vào các request bên trong 
public class MainController {


	@RequestMapping("/helloworld")
	@ResponseBody//đường dẫn để đi vào phương thức này, nếu ko khai báo method thì mặc định là GET 
	public String handler() {
		return "helloworld";
	}
}