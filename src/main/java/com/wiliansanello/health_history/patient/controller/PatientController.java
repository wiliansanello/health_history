package com.wiliansanello.health_history.patient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/patient")
public class PatientController {

    @GetMapping("/")
    public String testingHealthHistory(){
        return "Bem-vindo paciente";
    }       
}
