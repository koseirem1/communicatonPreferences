package com.aep.communicatonpreferences.scopesample;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
//@Scope("singleton") // default
@Scope("prototype")
public class BookBean {

    public BookBean(){
        System.out.println("CONSTRUCTOR --> Book Bean constructor method executed!");
    }

    public void sayIsbn(){
        System.out.println("My ISBN : 1234");
    }
}