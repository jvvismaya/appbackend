package com.example.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.store.model.Mobiles;

public interface MobilesRepository extends JpaRepository<Mobiles, Long>,CrudRepository<Mobiles, Long> {
	
	@Query(value="select count(id)from mobiles",nativeQuery=true)
	int countMobile();
	
	@Query(value="SELECT SUM(CASE WHEN status = 'Active' THEN 1 ELSE 0 END) AS Active FROM mobiles",nativeQuery = true)
	Long countStatus();
	
	@Query(value="SELECT SUM(CASE WHEN status = 'Inactive' THEN 1 ELSE 0 END) AS Active FROM mobiles",nativeQuery = true)
	Long countinactiveStatus();
	
	@Query(value="SELECT SUM(CASE WHEN status = 'Damaged' THEN 1 ELSE 0 END) AS Active FROM mobiles",nativeQuery = true)
	Long countdamagedStatus();
	

}
