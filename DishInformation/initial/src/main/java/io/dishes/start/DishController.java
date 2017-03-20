package io.dishes.start;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DishController {

	@Autowired
	private DishService DS;
	
	@RequestMapping("/dishes")
	public List<Dish> getAllDishes(){
		return DS.getAllDishes();
	}
	
	@RequestMapping("/dishes/{name}") 
	public Dish getDish(@PathVariable String name)
	{
		return DS.getDish(name);
	}

	@RequestMapping(method = RequestMethod.POST, value="/dishes")
	public void addDish(@RequestBody Dish dish)
	{
		DS.addDish(dish);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/dishes/{name}")
	public void updateDish(@RequestBody Dish dish, @PathVariable String name)
	{
		DS.updateDish(name, dish);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/dishes/{name}")
	public void deleteDish(@PathVariable String name)
	{
		DS.deleteDish(name);
	}
}
