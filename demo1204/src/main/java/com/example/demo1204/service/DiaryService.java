package com.example.demo1204.service;

import org.springframework.stereotype.Service;

import com.example.demo1204.domain.Diary;


public interface DiaryService {
	public Diary selectDiaryById(int id);
	public Diary selectDiaryMessageById(int id);
}
