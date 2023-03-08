package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="matchmodel")
public class Match {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO	)
	private int S_id;
	private String TeamName;
	private String TeamCaptain;
	private int MatchWon;
	private int MatchLoss;
	public Match(int s_id, String teamName, String teamCaptain, int matchWon, int matchLoss) {
		super();
		S_id = s_id;
		TeamName = teamName;
		TeamCaptain = teamCaptain;
		MatchWon = matchWon;
		MatchLoss = matchLoss;
	}
	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getS_id() {
		return S_id;
	}
	public void setS_id(int s_id) {
		S_id = s_id;
	}
	public String getTeamName() {
		return TeamName;
	}
	public void setTeamName(String teamName) {
		TeamName = teamName;
	}
	public String getTeamCaptain() {
		return TeamCaptain;
	}
	public void setTeamCaptain(String teamCaptain) {
		TeamCaptain = teamCaptain;
	}
	public int getMatchWon() {
		return MatchWon;
	}
	public void setMatchWon(int matchWon) {
		MatchWon = matchWon;
	}
	public int getMatchLoss() {
		return MatchLoss;
	}
	public void setMatchLoss(int matchLoss) {
		MatchLoss = matchLoss;
	}
	
	
	
}