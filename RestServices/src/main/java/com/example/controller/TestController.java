package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.model.Movies;
import com.example.repositorie.IMoviesRepo;





@Controller
public class TestController {
	
	@Autowired
	private IMoviesRepo repo;
	
	
	 @GetMapping("/movies")
	    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		 Movies movie1= new Movies();
		 movie1.setId(2);
		 movie1.setTitle("Movie2");
		 movie1.setGenre("Action");
		 movie1.setDirector("Director2");
		 movie1.setDuration(120);
		 repo.save(movie1);
		 model.addAttribute("name",name);
		 return "'movies";
	    }
	 
	 @GetMapping("/listar")
	    public String greeting(Model model){
			
			
			
	        model.addAttribute("personas", repo.findAll());
	        return "movies";
	    }
	 
}
