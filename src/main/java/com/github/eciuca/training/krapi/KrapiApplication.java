package com.github.eciuca.training.krapi;

import com.github.eciuca.training.krapi.domain.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@Import({ WebSocketConnectionConfig.class})
public class KrapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(KrapiApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**");
			}
		};
	}

	@Bean
	public RepositoryRestConfigurer repositoryRestConfigurer() {
		return RepositoryRestConfigurer.withConfig((config, corsRegistry) -> {
			config.exposeIdsFor(
					Agent.class,
					Company.class,
					Customer.class,
					Food.class,
					Order.class,
					Student.class,
					StudentReport.class
			);
			corsRegistry.addMapping("/**");
		});
	}
}
