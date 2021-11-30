package com.aep.communicatonpreferences.controller;

import com.aep.communicatonpreferences.service.CommunicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FieldCommunicationController {

    @Autowired
    public CommunicationService communicationService;

    public void handleMessage() {
        System.out.println(communicationService.sendMessage());
    }
}
