package com.bgrulers.repository;

import com.bgrulers.entity.Ruler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sslavkov on 5/30/16.
 */
@Repository
public interface RulerRepository extends JpaRepository<Ruler, Long> {
	
}
