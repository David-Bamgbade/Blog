package data.models;

import java.time.LocalDateTime;

public class Comment {
    private int id;
    private int userId;
    private String content;
    private int postId;
    private LocalDateTime time;

    public void setCommentId(int key){
        this.id = key;
    }

    public void setUserId(int key){
        this.userId = key;
    }

    public String getCommentText(){
        return content;
    }

    public void setPostId(int number ){
        this.postId = number;
    }

    public int getUserId(){
        return userId;
    }

    public void setCommentText(String story){
        this.content = story;
    }

    public int getPostId(){
        return postId;
    }

    public int getCommentId(){
        return id;
    }

    public void setCreatedAt(LocalDateTime date){
        this.time = date;
    }

    public LocalDateTime getCreatedAt(){
        return time;
    }






}
