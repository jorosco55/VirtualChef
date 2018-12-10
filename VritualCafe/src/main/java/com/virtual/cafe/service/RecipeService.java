package com.virtual.cafe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtual.cafe.model.Recipe;
import com.virtual.cafe.repository.RecipeRepository;

@Service
public class RecipeService {
	
	@Autowired
	private RecipeRepository recipeRepository;
	
	//Create Operation
	public Recipe create(String recipeName, String recipeIngrediants, int servings) {
		return recipeRepository.save(new Recipe(recipeName, recipeIngrediants, servings));
	}
	
	//Retrieve data
	public List<Recipe> getAll(){
		return recipeRepository.findAll();
	}
	
	public Recipe getByRecipeName(String recipeName) {
		return recipeRepository.findbyRecipeName(recipeName);
	}
	
	//Update data
	public Recipe update(String recipeName, String recipeIngrediants, int servings) {
		Recipe newRecipe = recipeRepository.findbyRecipeName(recipeName);
		newRecipe.setRecipeIngrediants(recipeIngrediants);
		newRecipe.setServings(servings);
		return recipeRepository.save(newRecipe);
	}
	
	//delete method
	public void deleteAll() {
		recipeRepository.deleteAll();
	}
	
	public void delete(String recipeName) {
		Recipe newRecipe = recipeRepository.findbyRecipeName(recipeName);
		recipeRepository.delete(newRecipe);
	}
	
	
}
