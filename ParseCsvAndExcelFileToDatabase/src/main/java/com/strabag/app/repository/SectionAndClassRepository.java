package com.strabag.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.strabag.app.entity.SectionAndClass;

@Repository
public interface SectionAndClassRepository extends JpaRepository<SectionAndClass, Integer> {

	@Query(value = "SELECT * FROM section_and_class where jobID = :jobID", nativeQuery = true)
	List<SectionAndClass> findbyJobId(@Param("jobID") int JobID);

}
