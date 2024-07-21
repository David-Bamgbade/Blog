package repositories;

import data.models.Comment;
import data.models.Post;

import java.util.List;

public interface CommentRepository {
    Comment findByPostId(int element);
    List<Comment> findAll();
    long count();
    void deleteAlL();
    void deleteByPostId(int element);
    boolean isEmpty();
    Comment findByCommentId(int identity);
    void save(Comment opinion);
    void deleteByCommentId(int identity);

}
