/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Wesley
 */
@RestController
public class PrototypeApi340Controller {

    @GetMapping("/norris")
    public String getNorris() {
        try {
            String url = "https://api.chucknorris.io/jokes/random";
            RestTemplate restTemplate = new RestTemplate();

            String joke = restTemplate.getForObject(url, String.class);
            return joke;
            
        } catch (Exception ex) {
            Logger.getLogger(PrototypeApi340Controller.class.getName()).log(Level.SEVERE, null, ex);
            return "error in /joke";
        }
    }

}
