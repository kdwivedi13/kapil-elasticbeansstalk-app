package com.example.restservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class SymbolAppenderControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void appendCopyrightSymbolTest() throws Exception {
		MvcResult result = this.mockMvc
				.perform(MockMvcRequestBuilders.post("/append-copyright-symbol")
						.content("Google LLC is an American multinational technology company."))
				.andExpect(status().isOk()).andReturn();

		assertEquals("Google© LLC is an American multinational technology company.",
				result.getResponse().getContentAsString());
	}
}
