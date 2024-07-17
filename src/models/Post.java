package models;

import java.time.LocalDateTime;

import java.util.List;

public class Post {
    private LocalDateTime date;
    private String title;
    private int Id;
    private String content;
    private List<Comment> comments;

    public LocalDateTime getCreatedAt() {
        return date;
    }

    public void setComments(List<Comment> posts) {
        this.comments = posts;
    }

    public List<Comment> getComments() {
        return comments;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setUpdatedAt(LocalDateTime time) {
        this.date = time;
    }

    public void setId(int tag){
        this.Id = tag;
    }

    public int getId(){
        return Id;
    }

    public void setCreatedAt(LocalDateTime time) {
        this.date = time;
    }

    public LocalDateTime getCreatedAt(LocalDateTime time ){
        return time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    


}
