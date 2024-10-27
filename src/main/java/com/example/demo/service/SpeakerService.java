package com.example.demo.service;



import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Event;
import com.example.demo.entity.Speaker;
import com.example.demo.repository.EventRepository;
import com.example.demo.repository.SpeakerRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SpeakerService {
	
	private final EventRepository eventRepository;
	private final SpeakerRepository speakerRepository;
	
	@Transactional
	public void createDb() {
		Speaker speaker1=new Speaker("John Doe","john@gmail.com");
		Speaker speaker2=new Speaker("John William","william@gmail.com");
		Speaker speaker3=new Speaker("Thomas Hardy", "hardy@gmail.com");
		
		
		Event event1=new Event("Java One", "Tokyo");
		Event event2=new Event("Python", "India");
		Event event3=new Event("Groovy", "UK");
		
		speaker1.addEvent(event1);
		speaker1.addEvent(event2);
		speaker1.addEvent(event3);
		
		speaker2.addEvent(event2);
		speaker3.addEvent(event3);
		
		speakerRepository.save(speaker1);
		speakerRepository.save(speaker2);
		speakerRepository.save(speaker3);
		
		
	}

}
