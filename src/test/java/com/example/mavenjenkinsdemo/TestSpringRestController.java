package com.example.mavenjenkinsdemo;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.junit.runners.Suite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(Runner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
@AutoConfigureMockMvc
public class TestSpringRestController{

	@Autowired
	private MockMvc mvc;

	@Test
	public void doDataTest() {
		try {
			System.out.println("Test Running #####");
			mvc.perform(MockMvcRequestBuilders.get("/api/tdd/testcall").accept(MediaType.APPLICATION_JSON))
					.andDo(print()).andExpect(status().isOk())
					.andExpect(MockMvcResultMatchers.jsonPath("responseData").exists());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
