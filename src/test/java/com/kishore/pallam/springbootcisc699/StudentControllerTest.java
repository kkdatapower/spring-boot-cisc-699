package com.kishore.pallam.springbootcisc699;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.kishore.pallam.springbootcisc699.dto.Student;

import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest
public class StudentControllerTest {

	@Autowired
	private MockMvc mockMvc;



	private static ObjectMapper mapper = new ObjectMapper();

	@Test
	public void testGetExample() throws Exception {
		

		mockMvc.perform(MockMvcRequestBuilders.get("/hello")).andExpect(MockMvcResultMatchers.status().is(200))
        .andExpect(MockMvcResultMatchers.content().string("Hello World"))
        .andExpect(MockMvcResultMatchers.header().string("Content-Type", "text/plain;charset=UTF-8"))
        .andExpect(MockMvcResultMatchers.header().string("Content-Length", "11"));
    
	}

	
}