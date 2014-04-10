package com.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.menu.Menu;
import com.test.menu.MenuItem;


@Controller
@EnableAutoConfiguration
public class Application {

	
	@RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
	
	@RequestMapping("/menu")
    @ResponseBody
    List<Menu> menu() {
		List<Menu> menulist = new ArrayList<Menu>();
		menulist.add(new Menu(MenuItem.Burger_1.name(), MenuItem.Burger_1.price) );
		menulist.add(new Menu(MenuItem.Fries.name(), MenuItem.Fries.price) );
		menulist.add(new Menu(MenuItem.ColddDrinks_1.name(), MenuItem.ColddDrinks_1.price) );
        return menulist;
    }
	
	@RequestMapping(method = RequestMethod.POST,value="/calculate",consumes= "application/json")
	@ResponseBody
	Double calculateMenuPrice(@RequestBody String[] menuList)
	{
		Double val = 0.0;
		for(String menu : menuList)
		{
			val+= MenuItem.valueOf(menu).price;
		}
		return val;
	}
	

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
