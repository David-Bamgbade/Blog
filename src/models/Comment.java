package models;

import java.time.LocalDateTime;

public class Comment {
    private int id;
    private int userId;
    private String content;
    private int postId;
    private LocalDateTime time;

    public void setId(int key){
        this.id = key;
    }

    public void setUserId(int key){
        this.userId = key;
    }

    public String getContent(){
        return content;
    }

    public void setPostId(int number ){
        this.postId = number;
    }

    public int getUserId(){
        return userId;
    }

    public void setContent(String story){
        this.content = story;
    }

    public int getPostId(){
        return postId;
    }

    public int getId(){
        return id;
    }

    public void setCreatedAt(LocalDateTime date){
        this.time = date;
    }

    public LocalDateTime getCreatedAt(){
        return time;
    }






}
