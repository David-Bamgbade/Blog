package models;

import org.junit.jupiter.api.Test;

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
    public void testThatSetTimeForPostMethodWorks() {
        Post post = new Post();
      //  post.setCreatedAt(2024-07-17);
        assertEquals("2024-07-17", post.getCreatedAt().toString());
    }

    @Test
    public void testThatSetCreatedAtMethodWorks() {
        Comment comment = new Comment();
        comment.setContent("My First Content");
        assertEquals("My First Content", comment.getContent());
    }

    @Test
    public void testToThatSetUserIdMethodWorks() {
        Comment comment = new Comment();
        comment.setUserId(1234);
        assertEquals(1234, comment.getUserId());
    }

    @Test
    public void testThatSetIdMethodWorksForCommentClass(){
        Comment comment = new Comment();
        comment.setId(453);
        assertEquals(453, comment.getId());
    }

    @Test
    public void testThatSetCommentMethodWorksForCommentClass(){
        Comment comment = new Comment();
        comment.setPostId(567);
        assertEquals(567, comment.getPostId());
    }











}