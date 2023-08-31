package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Restaurant;

public interface RestaurantRepo extends JpaRepository<Restaurant, Integer> {
	
	@Query(value="select * from restaurant where restaurantname=:sn or cuisinetype=:ss",nativeQuery=true)
	public List<Restaurant>getrestandcuisineinfo(@Param("sn") String restaurantname,@Param("ss") String cuisinetype);
	
	@Query(value="select * from restaurant where restaurantname=:sn and location=:ss",nativeQuery=true)
	public List<Restaurant>getrestandlocinfo(@Param("sn") String restaurantname,@Param("ss") String location);
	
	@Query(value="select * from restaurant where rating=:sn",nativeQuery=true)
	public List<Restaurant>getbyrating(@Param("sn") float rating);
	

}
