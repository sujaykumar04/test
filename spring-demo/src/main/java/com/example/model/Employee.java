
	package com.example.model;

	import jakarta.persistence.*;

	@Entity
	@Table(name = "employee")
	public class Employee {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String work;
	    private double salary;

	    // Getters & Setters
	}


