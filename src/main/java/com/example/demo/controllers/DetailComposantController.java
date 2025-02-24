package com.example.demo.controllers;

import com.example.demo.Services.DetailComposantService;
import com.example.demo.entity.DetailComposant;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class DetailComposantController {
    DetailComposantService detailComposant;
}
