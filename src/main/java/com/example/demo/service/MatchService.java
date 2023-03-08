package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Match;
import com.example.demo.repository.MatchRepository;

@Service
public class MatchService {
	
	@Autowired
	MatchRepository matchrepository;
	
	public Optional<Match>getMatch(int S_id){
		return matchrepository.findById(S_id);
	}
	public String updateDetails(Match m) {
		matchrepository.save(m);
		return "UPDATED";
	}
	public String deleteDetails(int S_id) {
		matchrepository.deleteById(S_id);
		return "ID DELETED";
	}

}
