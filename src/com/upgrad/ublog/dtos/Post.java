package com.upgrad.ublog.dtos;

import java.time.LocalDateTime;

public class Post {
    private int postId;
    private String emailId;
    private String tag;
    private String title;
    private String description;
    private LocalDateTime timestamp;

    public Post(int postId, String emailId, String tag, String title, String description, LocalDateTime timestamp) {
        this.postId = postId;
        this.emailId = emailId;
        this.tag = tag;
        this.title = title;
        this.description = description;
        this.timestamp = timestamp;
    }

    public Post() {     }

    public int getPostId() { return postId; }

    public String getEmailId() { return emailId; }

    public String getTag() { return tag; }

    public String getTitle() { return title; }

    public String getDescription() { return description; }

    public LocalDateTime getTimestamp() { return timestamp; }

    public void setPostId(int postId) { this.postId = postId; }

    public void setEmailId(String emailId) { this.emailId = emailId; }

    public void setTag(String tag) { this.tag = tag; }

    public void setTitle(String title) { this.title = title; }

    public void setDescription(String description) { this.description = description; }

    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", emailId='" + emailId + '\'' +
                ", tag='" + tag + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
