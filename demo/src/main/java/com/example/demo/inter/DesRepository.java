package com.example.demo.inter;

import com.example.demo.been.Des;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesRepository extends JpaRepository<Des, Long> {
    Des findDesByUserId(long id);
}
