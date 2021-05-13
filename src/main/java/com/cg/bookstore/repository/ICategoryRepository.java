package com.cg.bookstore.repository;

import java.util.List;
//import java.util.Optional;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.bookstore.entities.Category;

@Repository
	public interface ICategoryRepository extends JpaRepository<Category, Integer> {

	
	
	//Viewing All the data present in the category
	@Query(value="select * from category",nativeQuery=true)
	public List<Category> getAllCategories();

	//Count the Category ID
	@Query(value="SELECT count(category_id) from category",nativeQuery=true)
	public int categoryCount();
	
}
