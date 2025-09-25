package com.virgilebodin.beta_lecteur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BetaLecteurApplication {

	public static void main(String[] args) {
		SpringApplication.run(BetaLecteurApplication.class, args);
	}

}
