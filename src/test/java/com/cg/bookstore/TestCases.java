package com.cg.bookstore;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.bookstore.entities.Category;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.cg.bookstore.repository.ICategoryRepository;

@SpringBootTest
public class TestCases extends BookStoreManagementApplicationTests {
	
	@Autowired
	ICategoryRepository iCategoryRepo;
	@Test
	void viewallCategories(){
		List<Category> obj=iCategoryRepo.findAll();
		 assertEquals(obj,iCategoryRepo.findAll());
	}
	@Test
	void getAllCategories() {
		int count=iCategoryRepo.categoryCount();
		List<Category> list=iCategoryRepo.findAll();
		 assertEquals(count,list.size());	
	}
	

}
