package com.bgrulers.repository;

import com.bgrulers.entity.Ruler;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sslavkov on 5/30/16.
 */
@Repository
public interface RulerRepository extends PagingAndSortingRepository<Ruler, Long> {
	
}
