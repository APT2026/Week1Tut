package com.ingcollegeapt.week1tut.model;

//Create a POJO Class for Topic

import java.time.LocalDateTime;

/*
It has id, name, created and updated TimeStamp
*/
public class Topic {
    private int topicId;
    private String topicName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Topic(int topicId, String topicName) {
        this.topicId = topicId;
        this.topicName = topicName;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public int getTopicId() {
        return topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
        this.updatedAt = LocalDateTime.now();
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
        this.updatedAt = LocalDateTime.now();
    }

    
    
    
    
    
}
