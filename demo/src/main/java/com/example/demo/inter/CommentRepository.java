package com.example.demo.inter;

import com.example.demo.been.Comment;
import com.example.demo.been.Des;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    Comment findById(long id);
}
