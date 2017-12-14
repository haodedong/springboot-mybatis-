package com.example.demo1204.controller;

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
		public String dd(@RequestBody User user) {
			Integer i=ajaxService.findUser(user);
			if(null==i) {
				return "err444or";
			}
			return "succ444ess";
		}
}
