package com.bgrulers.repository;

import com.bgrulers.entity.Ruler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface RulerRepository extends JpaRepository<Ruler, Long> {
	Collection<Ruler> findByNameIgnoreCase(@Param("name") String name);
    Collection<Ruler> findByDynastyNameIgnoreCaseOrderByReignStartAsc(@Param("dynastyName") String dynastyName);
//    @Query("select r from Ruler r where r.reignStart >= :reignDate and r.reignEnd <= :reignDate")
//    Collection<Ruler> findByReignDate(@Param("reignDate") String reignDate);
}
