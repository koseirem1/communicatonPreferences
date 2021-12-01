package com.aep.core.beans;

import org.springframework.stereotype.Component;

@Component
public class DifferentLvelComponent {

    public void testMe() {
        System.out.println("Farklı paketteki Component Çalışıyor");
    }
}
