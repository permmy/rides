package com.rides.service;

import com.rides.model.ThemeParkRide;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ThemeParkRideService {
  static List<ThemeParkRide> parkRides = new ArrayList<>();

  static {
    parkRides.add(new ThemeParkRide(1L,"Rollercoaster", "Train ride that speeds you along.", 5, 3));
    parkRides.add(new ThemeParkRide(2L,"Log flume", "Boat ride with plenty of splashes.", 3, 2));
    parkRides.add(new ThemeParkRide(3L,"Teacups", "Spinning ride in a giant tea-cup.", 2, 4));
  }

  public List<ThemeParkRide> getRides() {
    return parkRides;
  }

  public ThemeParkRide getRide(Long id) {
    return parkRides.stream().filter(r-> r.getId().equals(id)).findAny().orElse(null);
  }

  public ThemeParkRide createRide(ThemeParkRide themeParkRide) {
    parkRides.add(themeParkRide);
    return themeParkRide;
  }
}
