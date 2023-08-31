package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Menu;

public interface MenuRepo extends JpaRepository<Menu, Integer> {
	
	@Query(value="select * from me where price=:sn",nativeQuery=true)
	public List<Menu>getpriceinfo(@Param("sn") int price);

	@Query(value="select * from me where itemname=:sn",nativeQuery=true)
	public List<Menu>getitemnameinfo(@Param("sn") String itemname);
	

}
