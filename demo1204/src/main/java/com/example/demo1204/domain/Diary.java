package com.example.demo1204.domain;

import java.util.Date;
import java.util.List;

public class Diary {
  
    private Integer id;

   
    private String title;

    
    private String content;

   
    private Date pubTime;

    
    private Integer userId;
    
    private Users users;
    private List<Tags> tags;

   public Users getUser() {
		return users;
	}


	public void setUser(Users user) {
		this.users = users;
	}


	public List<Tags> getTags() {
		return tags;
	}


	public void setTags(List<Tags> tags) {
		this.tags = tags;
	}



    public Integer getId() {
        return id;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }

    
    public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    
    public String getContent() {
        return content;
    }

    
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    
    public Date getPubTime() {
        return pubTime;
    }

    
    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    
    public Integer getUserId() {
        return userId;
    }

   
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}