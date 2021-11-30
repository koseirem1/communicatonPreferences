package com.aep.communicatonpreferences.controller;


import com.aep.communicatonpreferences.service.CommunicationService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorCommunicationController {

    private final CommunicationService communicationService;

    public ConstructorCommunicationController( CommunicationService communicationService) {
        this.communicationService = communicationService;
    }

    public void handleMessage() {
        System.out.println(communicationService.sendMessage());
    }
}
