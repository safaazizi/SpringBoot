package com.example.demo.controllers;

import com.example.demo.Services.MenuService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class MenuController {
    MenuService menuService;
}
