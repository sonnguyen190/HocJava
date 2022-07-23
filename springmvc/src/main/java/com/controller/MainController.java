package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {
	
	@RequestMapping("/a")
	@ResponseBody//đường dẫn để đi vào phương thức này, nếu ko khai báo method thì mặc định là GET 
	public String handler() {
		return "a";
	}
}