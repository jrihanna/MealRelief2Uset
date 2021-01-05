package com.rihanna.neo4j.eg3.user.model;

import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;

import lombok.Getter;
import lombok.Setter;

@NodeEntity
@Getter
@Setter
public class User {
	
	private Long id;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private List<String> likedIngredients;
	private List<String> dislikedIngredients;

}
