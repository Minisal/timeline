package com.minisal.timeline;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String user;
    private String content;
    private String addTime;

    public String getContent() {
        return content;
    }

    public String getUser() {
        return user;
    }

    public Integer getId() {
        return id;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }
}



