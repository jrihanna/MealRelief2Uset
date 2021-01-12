package com.rihanna.neo4j.eg3.user.model;

import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

import lombok.Getter;
import lombok.Setter;

@NodeEntity
@Getter
@Setter
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;

}
