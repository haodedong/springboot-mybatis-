package com.example.demo1204.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1204.domain.Diary;
import com.example.demo1204.domain.InputDemo;
import com.example.demo1204.service.DiaryService;

@RestController
@RequestMapping("/a")
public class DiaryController {
	private final Logger logger=LoggerFactory.getLogger(DiaryController.class);
	@Autowired
	private DiaryService diaryServiceImpl;
	@Autowired
	private InputDemo inputd;
	@RequestMapping(value="/diary")
	/**
	 * 通过id查询一篇文章
	 * @param id
	 * @return
	 */
	public Diary selectDiaryById(@RequestParam(value = "id", required = true) int id) {
		

		return  diaryServiceImpl.selectDiaryById(id);
	}
	@RequestMapping(value="/dia")//@RequestParam可写可不写
	public Diary selectDiaryMessageById(@RequestBody int id) {
		return diaryServiceImpl.selectDiaryMessageById(id);

	}
	@RequestMapping("/hello/{d}")
	public String dd(@PathVariable("d" ) int d){
		
	    int a=3;
		return "ddddssssass";
	}
	@RequestMapping("/qnmd")
	public String dd() {
		logger.info("=============================================");
		String s=inputd.getA();
		return s;
	}
}
