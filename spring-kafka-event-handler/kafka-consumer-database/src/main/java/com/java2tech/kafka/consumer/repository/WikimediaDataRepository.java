package com.java2tech.kafka.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java2tech.kafka.consumer.entity.WikimediaData;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
}
