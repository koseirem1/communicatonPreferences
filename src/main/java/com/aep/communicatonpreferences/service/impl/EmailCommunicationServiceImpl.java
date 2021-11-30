package com.aep.communicatonpreferences.service.impl;

import com.aep.communicatonpreferences.service.CommunicationService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("email")
@Service
public class EmailCommunicationServiceImpl implements CommunicationService {
    @Override
    public String sendMessage() {
        return "E-mail gönderildi.";
    }
}
