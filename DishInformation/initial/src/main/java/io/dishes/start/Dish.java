package io.dishes.start;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Dish {
	
	@Id
	private String dishName;
	
	private String recipe;
	private int calories;
	
	public Dish(){
		
	}
	public Dish(String dishName, String recipe, int calories){
		super();
		this.dishName = dishName;
		this.recipe = recipe;
		this.calories = calories;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public String getRecipe() {
		return recipe;
	}
	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
}
