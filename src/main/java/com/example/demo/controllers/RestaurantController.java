package com.example.demo.controllers;

import com.example.demo.Services.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class RestaurantController {
RestaurantService restaurantService;
}
