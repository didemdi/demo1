package com.example.demo1.repository;


import com.example.demo1.entity.Haberler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HaberlerRepository extends JpaRepository<Haberler, Long> {
}
