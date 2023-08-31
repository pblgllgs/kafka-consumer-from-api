package com.pblgllgs.kafka.repository;

import com.pblgllgs.kafka.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaRepository extends JpaRepository<WikimediaData,Long> {
}
