package com.sl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.sl.Repository.UserRepository;
import com.sl.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class UserController {
	@Autowired
	public UserRepository userRepo;

	@GetMapping("/")
	public String ShowForm(Model model) {
		model.addAttribute("user", new User());
		// return LVN
		return "user-form";
	}
	
	@PostMapping("/save")
	public String saveUser(@ModelAttribute User user) {
		userRepo.save(user);
		
		return "redirect:/";
	}
	

}
