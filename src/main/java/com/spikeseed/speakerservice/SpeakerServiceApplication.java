package com.spikeseed.speakerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@SpringBootApplication
public class SpeakerServiceApplication {


	@GetMapping("/speaker")
	public String getSpeaker() throws UnknownHostException {
		return "Speaker details returned by " + InetAddress.getLocalHost().getHostName();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpeakerServiceApplication.class, args);
	}
}
