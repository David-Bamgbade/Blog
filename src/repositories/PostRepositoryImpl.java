package repositories;

import data.models.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepositoryImpl implements PostRepository {

    private List<Post> postStuff = new ArrayList<Post>();
    private long count;
    private boolean empty;

    @Override
    public Post findById(int element) {
        for (Post post : postStuff) {
            if (element == post.getId()) {
                return post;
            }
        }
        return null;
    }

    @Override
    public List<Post> findAll() {
        return List.of();
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public void deleteAlL() {
        postStuff.clear();
        count = 0;
    }

    @Override
    public Post save(Post something) {
        postStuff.add(something);
        count++;
        return something;
    }

    @Override
    public void deleteById(int element) {
        for (Post post : postStuff) {
               if(element == post.getId()) {
                   postStuff.remove(post);
                   count--;
                  break;
               }
        }
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}













