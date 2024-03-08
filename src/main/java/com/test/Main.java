package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import over.ListenerService;
import over.ListenerServiceImpl;
@SpringBootApplication
@RestController
public class Main {

    @GetMapping("/")
    public String bemvindo() {
        return "aplicacao no ar";
    }
    @GetMapping("/{input}")
    public String congratu(@PathVariable String input){
        return "bem vindo ao openshift ..";
    }



    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

   /*     ListenerService listenerService = new ListenerServiceImpl();

        try {
            listenerService.KafkaSender();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

    }
}


