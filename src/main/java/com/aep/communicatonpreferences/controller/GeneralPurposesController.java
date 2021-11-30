package com.aep.communicatonpreferences.controller;

import com.aep.communicatonpreferences.service.CommunicationService;
import org.springframework.stereotype.Controller;

@Controller
public class GeneralPurposesController {
    private final CommunicationService communicationService;

    public GeneralPurposesController( CommunicationService communicationService) {
        this.communicationService = communicationService;
    }

    public void handleMessage() {
        System.out.println(communicationService.sendMessage());
    }
}
