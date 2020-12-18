package com.rides.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ThemeParkRideTest {
  @Autowired
  private MockMvc mockMvc;

  @Test
  public void getAllRides() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/rides")
        .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andReturn();
  }

  @Test
  public void getSingleRide() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/ride/1")
        .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andReturn();
  }

  public void addsNewRide() throws Exception {
    String newRide = "{\"id\":9,\"name\":\"Monorail\",\"description\":\"Sedate travelling ride.\",\"thrillFactor\":2,\"vomitFactor\":1}";
    mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/ride")
        .contentType(MediaType.APPLICATION_JSON)
        .content(newRide)
        .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andReturn();
  }
}
