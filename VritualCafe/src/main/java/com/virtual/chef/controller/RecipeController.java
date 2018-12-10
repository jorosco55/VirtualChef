package com.virtual.chef.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.virtual.cafe.model.Recipe;
import com.virtual.cafe.service.RecipeService;

@RestController
public class RecipeController {
	
	@Autowired
	private RecipeService recipeService;
	
	@RequestMapping("/create")
	public String create(@RequestParam String recipeName, @RequestParam String recipeIngrediants, @RequestParam int servings) {
		Recipe newRecipe = recipeService.create(recipeName, recipeIngrediants, servings);
		return newRecipe.toString();
	}
	
	@RequestMapping("/get")
	public Recipe getRecipe(@RequestParam String recipeName) {
		return recipeService.getByRecipeName(recipeName);
	}
	
	@RequestMapping("/getAll")
	public List<Recipe> getAll(){
		return recipeService.getAll();
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam String recipeName, @RequestParam String recipeIngrediants, @RequestParam int servings) {
		Recipe newRecipe = recipeService.update(recipeName, recipeIngrediants, servings);
		return newRecipe.toString();
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam String recipeName, @RequestParam String recipeIngrediants, @RequestParam int servings) {
		recipeService.delete(recipeName);
		return "Deleted: " + recipeName;
	}
	
	@RequestMapping("/deleteAll")
	public String deleteAll() {
		recipeService.deleteAll();
		return "Deleted all recipes";
	}
}
