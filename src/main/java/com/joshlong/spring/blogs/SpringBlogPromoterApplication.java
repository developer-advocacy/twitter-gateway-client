package com.joshlong.spring.blogs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.reactive.function.client.WebClient;

// todo (X) build a teams page screen scraper
// todo build a spring integration rss feed reader
// todo build out DB schema to persist the blogs
// todo build a templating thing to compose the tweets and ensure that the thing we tweet out fits in 280c
@Slf4j
@EnableScheduling
@SpringBootApplication
public class SpringBlogPromoterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBlogPromoterApplication.class, args);
	}

	@Bean
	WebClient webClient(WebClient.Builder builder) {
		return builder.build();
	}

}