package com.cg.bookstore.service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookstore.customException.ServiceException;
import com.cg.bookstore.entities.Category;
import com.cg.bookstore.repository.ICategoryRepository;

@Service
public class CategoryService implements ICategoryService {
 @Autowired
 private ICategoryRepository categoryRepo;

 //Method For adding a category
 @Override
	public Category addCategory(Category category) {
	 Category categorySaved = categoryRepo.save(category);
		return categorySaved;
 }

 //Method For editing a category
	@Override
	public Category editCategory(Category category) {
		categoryRepo.save(category);
		return category;
	}
	//Method for Getting All the categories

	@Override
	public List<Category> getAllCategories() {
		List<Category> catList=null;
		catList=categoryRepo.findAll();
		return catList ;
	}

	//Method for deleting all the categories
	@Override
	public List<Category> removeCategory(Category cat) {
	categoryRepo.delete(cat);
	return categoryRepo.findAll();
	}	
}

