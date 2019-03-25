package com.gkkdcenter.testing;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import com.gkkdcenter.controller.HomeController;

public class HomeControllerTest {

  @Test
  public void testHomePage() throws Exception {
	  TreeSet<String> treeString = new TreeSet<>();
    HomeController controller = new HomeController();
    MockMvc mockMvc = standaloneSetup(controller).build();
    mockMvc.perform(get("/formdataibadah"))
           .andExpect(view().name("form_data_ibadah"));
  }
  
  @Test
  public void testMap() {
	  Map<Integer,String> map = new HashMap<>();
	  map.put(101, "Leonardo");
	  map.put(201, "Ginting");
	  map.put(301, "Regina");
	  
	  map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
  }

}
