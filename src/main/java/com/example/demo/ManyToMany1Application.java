package com.example.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.service.SpeakerService;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class ManyToMany1Application {
	private final SpeakerService speakerService;
	
	@Bean
	public ApplicationRunner runner() {
		return r ->{
			speakerService.createDb();
			JPAUtil.checkData("select * from speaker");
			JPAUtil.checkData("select * from event");
			JPAUtil.checkData("select * from speaker_events");
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ManyToMany1Application.class, args);
	}

}
