package com.example.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class LibRequest {
	@NotBlank
	private Integer id;
	@Size(min=7, message="The author name field must have at least 7 characters")
	private String author;
	@NotBlank
	private String title;
	@NotNull
	private float cost;
}
