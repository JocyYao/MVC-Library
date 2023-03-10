package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.example.dto.LibRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name = "library_book")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Entity
public class Library {
	@Id
	@GeneratedValue
	private Integer id;
	private String author;
	private String title;
	private float cost;
	
	
}
