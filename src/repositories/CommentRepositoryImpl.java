package repositories;

import data.models.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentRepositoryImpl implements CommentRepository {
    private List<Comment> comments = new ArrayList<Comment>();
    private List<Comment> deleteAll = new ArrayList<>();
    private boolean emptyOrNot;
    private long count;

    @Override
    public Comment findByPostId(int element) {
      for (Comment comment : comments) {
          if(element==comment.getPostId()) return comment;
      }
       return null;
    }

    @Override
    public List<Comment> findAll() {

        return List.of();
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public void deleteAlL() {
        deleteAll.addAll(comments);
        count = 0;
    }

    @Override
    public void save(Comment something) {
      comments.add(something);
      count++;
    }

    @Override
    public void deleteByCommentId(int identity) {
        for (Comment comment : comments) {
            if(identity==comment.getCommentId()) comments.remove(comment);
            count--;
            break;
        }

    }

    @Override
    public void deleteByPostId(int element) {
        for (Comment comment : comments) {
            if(element==comment.getPostId()) comments.remove(comment);
            count--;
        }
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Comment findByCommentId(int identity) {
        for (Comment comment : comments) {
            if(identity==comment.getCommentId()) return comment;
        }
        return null;
    }

}
