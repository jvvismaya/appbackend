package com.example.store.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.store.model.Accessories;

public interface AccessoriesRepository extends JpaRepository<Accessories, Long>,CrudRepository<Accessories,Long>{
	@Query(value="select count(id)from accessories",nativeQuery=true)
	Long coutAccessories();
	

	@Query(value="SELECT SUM(CASE WHEN status = 'Active' THEN 1 ELSE 0 END) AS Active FROM accessories",nativeQuery = true)
	Long countActiveStaus();
	
	@Query(value="SELECT SUM(CASE WHEN status = 'inActive' THEN 1 ELSE 0 END) AS Active FROM accessories",nativeQuery = true)
	Long countInActiveStaus();
	
	@Query(value="SELECT SUM(CASE WHEN status = 'damaged' THEN 1 ELSE 0 END) AS Active FROM accessories",nativeQuery = true)
	Long countDamagedStaus();

	

	

	

	

	

	

	

}
