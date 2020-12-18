package com.rides.controller;

import com.rides.model.ThemeParkRide;
import com.rides.service.ThemeParkRideService;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ThemeParkController {
  private final ThemeParkRideService themeParkRideService;

  public ThemeParkController(ThemeParkRideService themeParkRideService) {
    this.themeParkRideService = themeParkRideService;
  }

  @GetMapping(value = "/rides", produces = MediaType.APPLICATION_JSON_VALUE)
  public List<ThemeParkRide> rides() {
    return themeParkRideService.getRides();
  }

  @GetMapping(value = "/ride/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ThemeParkRide ride(@PathVariable Long id) {
    return themeParkRideService.getRide(id);
  }

  @PostMapping(value = "/ride", produces = MediaType.APPLICATION_JSON_VALUE)
  public ThemeParkRide createRide(@RequestBody ThemeParkRide themeParkRide) {
    return themeParkRideService.createRide(themeParkRide);
  }
}
