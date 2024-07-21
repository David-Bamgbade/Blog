package repositories;

import data.models.Post;

import java.util.List;

public interface PostRepository {
    Post findById(int element);
    List<Post> findAll();
    long count();
    void deleteAlL();
    Post save(Post something);
    void deleteById(int element);
    boolean isEmpty();
}
