package com.test;

import over.ListenerService;
import over.ListenerServiceImpl;

public class Main {


    public static void main(String[] args) {

        ListenerService listenerService = new ListenerServiceImpl();

        try {
            listenerService.KafkaSender();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


