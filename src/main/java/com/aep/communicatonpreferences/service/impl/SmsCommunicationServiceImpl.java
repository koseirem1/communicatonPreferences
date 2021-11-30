package com.aep.communicatonpreferences.service.impl;

import com.aep.communicatonpreferences.service.CommunicationService;
import org.springframework.stereotype.Service;

@Service
public class SmsCommunicationServiceImpl implements CommunicationService {

    @Override
    public String sendMessage() {
        return "Sms gönderildi";
    }
}
