package com.example.demo.controllers;

import com.example.demo.Services.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class ClientController {
    ClientService clientService;
}
