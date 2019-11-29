package com.demo.boot.controller;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.boot.domain.Player;
import com.demo.boot.domain.Team;

@Controller
public class DemoController {

	  private Team team;
	  
	  @PostConstruct
	  public void init() {
		  Set<Player> players= new HashSet<>();
		  players.add(new Player("Pele","forward"));
		  players.add(new Player("Requelme","centre forward"));
		  team= new Team("champs","Delhi",players);
		  
	  }
	  
	  @GetMapping("/team")
	  public @ResponseBody Team getTeam() {
		  
		  return team;
	  }
	  @RequestMapping("/hi") 
	  public @ResponseBody String hiThere() { 
		  return "hello there"; 
	  }
	 
	
	
	  @GetMapping("/hi/{name}")
	  public String hiThere(Map model,@PathVariable String name) {
		  model.put("name",name); 
		  return "hello";
		}
	 
}
	