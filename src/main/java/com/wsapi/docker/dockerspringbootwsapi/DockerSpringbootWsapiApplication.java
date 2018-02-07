package com.wsapi.docker.dockerspringbootwsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import com.wsapi.docker.dockerspringbootwsapi.testcase.Version;

@SpringBootApplication
public class DockerSpringbootWsapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringbootWsapiApplication.class, args);
	}
//
//	private static final Logger log = LoggerFactory
//			.getLogger(DockerSpringbootWsapiApplication.class);
//
//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		return builder.build();
//	}

//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		return args -> {
//
//			Version ver = restTemplate.getForObject(
//					"http://s1892.cxo.storage.hpecorp.net:8008/api/",
//					Version.class);
//
//			log.info(ver.toString());
//		};
//	}
}
