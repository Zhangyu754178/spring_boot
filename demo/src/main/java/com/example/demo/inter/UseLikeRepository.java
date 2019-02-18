package com.example.demo.inter;

import com.example.demo.been.Des;
import com.example.demo.been.UseLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UseLikeRepository extends JpaRepository<UseLike, Long> {
    UseLike findUseLikeByUseid(long id);
}
