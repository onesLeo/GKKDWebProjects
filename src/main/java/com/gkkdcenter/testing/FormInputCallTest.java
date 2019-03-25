package com.gkkdcenter.testing;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import com.gkkdcenter.controller.FormJemaatController;
import com.gkkdcenter.controller.HomeController;

public class FormInputCallTest {

	@Test
	public void test() throws Exception {
		FormJemaatController controller = new FormJemaatController();
		MockMvc mockMvc = standaloneSetup(controller).build();
		    mockMvc.perform(get("/formdataibadah"))
		           .andExpect(view().name("form_data_ibadah"));
	}

}
