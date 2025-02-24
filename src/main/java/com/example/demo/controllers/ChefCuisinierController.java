package com.example.demo.controllers;

import com.example.demo.Services.ChefCuisinierService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class ChefCuisinierController {
    ChefCuisinierService chefCuisinierService;
}
