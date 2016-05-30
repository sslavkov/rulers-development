package com.bgrulers.repository;

import com.bgrulers.entity.Ruler;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sslavkov on 5/30/16.
 */
//@RepositoryRestResource
@Repository
public interface RulerRepository extends CrudRepository<Ruler, Integer> {
	
}
