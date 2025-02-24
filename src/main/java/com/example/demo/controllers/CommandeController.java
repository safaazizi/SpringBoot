package com.example.demo.controllers;

import com.example.demo.Services.CommandeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class CommandeController {
    CommandeService commandeService;
}
