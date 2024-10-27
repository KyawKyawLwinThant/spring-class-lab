package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Speaker {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	public Speaker(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Event> events=
			new ArrayList<>();
	
	public void addEvent(Event event) {
		event.getSpeakers().add(this);
		events.add(event);
	}
	
	/*
	 * Collection,List,Set,Map
	 */
}
