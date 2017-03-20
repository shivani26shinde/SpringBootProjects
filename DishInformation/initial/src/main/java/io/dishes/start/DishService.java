package io.dishes.start;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DishService {
	
	@Autowired
	private DishRepository DR;

	public List<Dish> getAllDishes(){
		List<Dish> list = new ArrayList<>();
		DR.findAll().forEach(list::add);
		return list;
	}
	
	public Dish getDish(String name){
		return DR.findOne(name);
	}
	
	public void addDish(Dish dish){
		DR.save(dish);
	}
	
	public void updateDish(String name, Dish dish){
		DR.save(dish);
	}
	
	public void deleteDish(String name){
		DR.delete(name);
	}
}
