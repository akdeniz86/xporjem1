package com.project.questapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Product {
	
	@Id
	Long id;
	String firstName;
	String lastName;
	String email;

}
