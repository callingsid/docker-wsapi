package com.wsapi.docker.dockerspringbootwsapi.testcase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)	
public class GetVersionTestcase {

	@Autowired
	private TestRestTemplate restTemplate;

	private static final Logger log = LoggerFactory
			.getLogger(GetVersionTestcase.class);

	@Test
	public void testMajor() throws Exception {

		Version ver = restTemplate
				.getForObject("http://s1892.cxo.storage.hpecorp.net:8008/api/",
						Version.class);

		Integer expectedMajor = 1;
		assertEquals(expectedMajor, ver.major);

	}

	@Test
	public void testMinor() throws Exception {

		Version ver = restTemplate
				.getForObject("http://s1892.cxo.storage.hpecorp.net:8008/api/",
						Version.class);

		Integer expectedMinor = 6;
		assertEquals(expectedMinor, ver.minor);
	}

}
