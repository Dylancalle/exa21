package com.example.example1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IdentityControllerTest {


	@Autowired
	private TestRestTemplate restTemplate;

	@Autowired
	private IdentityService identityService;

	@Test
	public void testVerificarExistencia() {
		String testCI = "1234567890";
		boolean resultado = this.restTemplate
				.getForObject("http://localhost:/identity/verify/" + testCI, Boolean.class);
		assertThat(resultado).isTrue();
	}
}
