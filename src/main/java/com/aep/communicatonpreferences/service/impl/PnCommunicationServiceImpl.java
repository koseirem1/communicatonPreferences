package com.aep.communicatonpreferences.service.impl;

import com.aep.communicatonpreferences.service.CommunicationService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("pn")
@Service
public class PnCommunicationServiceImpl implements CommunicationService {
    @Override
    public String sendMessage() {
        return "Push notification gönderildi";
    }
}
