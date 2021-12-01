package com.aep.communicatonpreferences.controller;

import org.springframework.stereotype.Component;

@Component
public class UnderSamePackageLevelComponent {

    public void testMe() {
        System.out.println("Aynı paketteki Component Çalışıyor");
    }
}
