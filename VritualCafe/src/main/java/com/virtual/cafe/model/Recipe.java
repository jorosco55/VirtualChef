package com.virtual.cafe.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Recipe {
	@Id
	String id;
	String recipeName;
	String recipeIngrediants;
	int servings;
	
	public Recipe(String recipeName, String recipeIngrediants, int servings) {
		this.recipeName = recipeName;
		this.recipeIngrediants = recipeIngrediants;
		this.servings = servings;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public String getRecipeIngrediants() {
		return recipeIngrediants;
	}

	public void setRecipeIngrediants(String recipeIngrediants) {
		this.recipeIngrediants = recipeIngrediants;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}
	
	public String toString() {
		return "Recipe Name: " + recipeName + "the ingrediants: " + recipeIngrediants + "Nummber of servings: " + servings;
	}

	
}
