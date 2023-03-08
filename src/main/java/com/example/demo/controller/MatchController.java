package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Match;
import com.example.demo.repository.MatchRepository;
import com.example.demo.service.MatchService;

@RestController
@CrossOrigin
public class MatchController {
	
	@Autowired
	MatchRepository matchrepository;
	@Autowired
	MatchService matchservice;
	@GetMapping("/get")
	List<Match>getlist()
	{
		return matchrepository.findAll();
	}
	@PostMapping("/post")
	public Match create (@RequestBody Match mat)
	{
		return matchrepository.save(mat);
	}
	@GetMapping("/get/{id3}")
	public Optional <Match>getbyid(@PathVariable int id3)
	{
		return matchservice.getMatch(id3);
	}
	@PutMapping("/update")
	public String puti(@RequestBody Match match)
	{
		return matchservice.updateDetails(match);
	}
	@DeleteMapping("/delete/{id3}")
	public String del(@PathVariable int id3)
	{
		return matchservice.deleteDetails(id3);
	}
	

}
