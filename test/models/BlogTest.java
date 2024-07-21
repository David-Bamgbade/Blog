package models;

import data.models.Comment;
import data.models.Post;
import org.junit.jupiter.api.Test;
import repositories.CommentRepository;
import repositories.CommentRepositoryImpl;
import repositories.PostRepositoryImpl;

import static org.junit.jupiter.api.Assertions.*;

class BlogTest {
    @Test
    public void testThatSetTittleMethodWorks() {
        Post post = new Post();
        post.setTitle("My First Post");
        assertEquals("My First Post", post.getTitle());
    }

    @Test
    public void testThatSetIdMethodWorks() {
        Post post = new Post();
        post.setId(234);
        assertEquals(234, post.getId());
    }

    @Test
    public void testThatSetContentMethodWorks() {
        Post post = new Post();
        post.setContent("My First Content");
        assertEquals("My First Content", post.getContent());
    }

    @Test
    public void testToThatSetUserIdMethodWorks() {
        Comment comment = new Comment();
        comment.setUserId(1234);
        assertEquals(1234, comment.getUserId());
    }

    @Test
    public void testThatSetCommentMethodWorksForCommentClass(){
        Comment comment = new Comment();
        comment.setPostId(567);
        assertEquals(567, comment.getPostId());
    }

    @Test
    public void testThatPostCanBeSaved(){
        PostRepositoryImpl repo = new PostRepositoryImpl();
        Post post = new Post();
        post.setId(567);
        post.setTitle("My First Post");
        repo.save(post);
        assertEquals(1, repo.count());
        }

    @Test
    public void testThatTwoPostsCanBeSaved(){
        PostRepositoryImpl repo = new PostRepositoryImpl();
        Post post = new Post();
        post.setId(52);
        post.setTitle("My First Post");
        repo.save(post);
        post.setId(56);
        post.setTitle("My Second Post");
        repo.save(post);
        post.setTitle("My Third Post");
        repo.save(post);
        assertEquals(3, repo.count());
    }

    @Test
    public void testThatFindPostByIdMethodWorks(){
        PostRepositoryImpl repo = new PostRepositoryImpl();
        Post post = new Post();
        post.setId(567);
        post.setTitle("My First Post");
        post.setContent("The story");
        repo.save(post);
        assertEquals(post, repo.findById(567));
    }

    @Test
    public void testToDeletePostWithId(){
        PostRepositoryImpl repo = new PostRepositoryImpl();
        Post post = new Post();
        post.setId(567);
        post.setTitle("My First Post");
        repo.save(post);
        repo.deleteById(567);
        assertEquals(0, repo.count());
    }

    @Test
    public void testToSaveComment(){
        CommentRepositoryImpl repo = new CommentRepositoryImpl();
        Comment comment = new Comment();
        comment.setPostId(567);
        repo.save(comment);
        assertEquals(1, repo.count());
    }

    @Test
    public void testToDeleteComment(){
        CommentRepositoryImpl repo = new CommentRepositoryImpl();
        repo.isEmpty();
        assertFalse(repo.isEmpty());
    }

    @Test
    public void testToFindCommentByPostId(){
        CommentRepositoryImpl repo = new CommentRepositoryImpl();
        Comment comment = new Comment();
        comment.setCommentText("My First Comment");
        comment.setPostId(456);
        repo.save(comment);
        assertEquals(comment, repo.findByPostId(456));
    }

    @Test
    public void testToDeleteCommentByPostId() {
        Comment comment = new Comment();
        CommentRepositoryImpl repo = new CommentRepositoryImpl();
        comment.setPostId(67);
        comment.setCommentText("My Text");
        repo.deleteByPostId(67);
        assertEquals(0, repo.count());
    }

        @Test
        public void testToFindPostByCommentId(){
            Comment comment = new Comment();
            CommentRepositoryImpl repo = new CommentRepositoryImpl();
            comment.setCommentText("My First Comment");
            comment.setCommentId(98);
            repo.save(comment);
            assertEquals(comment, repo.findByCommentId(98));
        }

        @Test
        public void testToDeleteByCommentId(){
        CommentRepositoryImpl repo = new CommentRepositoryImpl();
        Comment comment = new Comment();
        comment.setCommentText("My First Comment");
        comment.setCommentId(98);
        repo.save(comment);
        repo.deleteByCommentId(98);
        assertEquals(0, repo.count());
        }

        @Test
        public void testToDeleteAllComments(){
        CommentRepositoryImpl repo = new CommentRepositoryImpl();
        Comment comment = new Comment();
        comment.setCommentText("My First Comment");
        comment.setCommentId(98);
        repo.save(comment);
        repo.deleteAlL();
        assertEquals(0, repo.count());
        }

        @Test
        public void testToDeleteAllPosts(){
        PostRepositoryImpl repo = new PostRepositoryImpl();
        Post post = new Post();
        post.setId(567);
        post.setTitle("My First Post");
        repo.save(post);
        post.setTitle("My Second Post");
        repo.save(post);
        post.setTitle("My Third Post");
        repo.save(post);
        repo.deleteAlL();
        assertEquals(0, repo.count());
        }





    }












