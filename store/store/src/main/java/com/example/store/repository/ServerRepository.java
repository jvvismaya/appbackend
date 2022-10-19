package com.example.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.store.model.Server;

public interface ServerRepository extends JpaRepository<Server, Long>,CrudRepository<Server, Long>{
	@Query(value = "select count(id) from server",nativeQuery=true)
	Long countServer();
	
	@Query(value="SELECT SUM(CASE WHEN status = 'Active' THEN 1 ELSE 0 END) AS Active FROM server",nativeQuery = true)
	Long countActiveStaus();
	
	@Query(value="SELECT SUM(CASE WHEN status = 'inActive' THEN 1 ELSE 0 END) AS Active FROM server",nativeQuery = true)
	Long countInActiveStaus();
	
	@Query(value="SELECT SUM(CASE WHEN status = 'damaged' THEN 1 ELSE 0 END) AS Active FROM server",nativeQuery = true)
	Long countDamagedStaus();
	
}
