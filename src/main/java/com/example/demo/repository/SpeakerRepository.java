package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker,Long>{

}
