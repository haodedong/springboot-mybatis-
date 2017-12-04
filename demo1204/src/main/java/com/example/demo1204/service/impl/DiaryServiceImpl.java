package com.example.demo1204.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1204.domain.Diary;
import com.example.demo1204.mapper.DiaryMapper;
import com.example.demo1204.service.DiaryService;
@Service
public class DiaryServiceImpl implements DiaryService{
	@Autowired
	private DiaryMapper diaryMapper;
	@Override
	public Diary selectDiaryById(int id) {
		// TODO Auto-generated method stub
		return diaryMapper.selectByPrimaryKey(id);
	}
	@Override
	public Diary selectDiaryMessageById(int id) {
		// TODO Auto-generated method stub
		return diaryMapper.selectDiaryMessageById(id);
	}

}
