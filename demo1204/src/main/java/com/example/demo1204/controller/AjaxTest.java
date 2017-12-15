package com.example.demo1204.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1204.domain.User;
import com.example.demo1204.service.AjaxService;

@RestController
public class AjaxTest {
	@Autowired
	private AjaxService ajaxService;
		@RequestMapping("/ajax1")
		public void dd(@RequestBody User user,HttpServletResponse response) throws IOException {
			Integer i=ajaxService.findUser(user);
			if(0==i) {
				response.setContentType("text/html;charset=UTF-8");
				response.getWriter().write("werwerweeeeeeeer");
				
			}
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().write("werwerwr");
			
		}
		@RequestMapping("/ajax2")
		public User dd(@RequestBody User user) {
			return user;
		}
}
