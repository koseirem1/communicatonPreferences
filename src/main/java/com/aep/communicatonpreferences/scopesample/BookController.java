package com.aep.communicatonpreferences.scopesample;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;


    @RestController
    @Scope(WebApplicationContext.SCOPE_SESSION)
//Scope(WebApplicationContext.SCOPE_REQUEST)
//@Scope("request")
    public class BookController {

        public BookController(){
            System.out.println("REST CONTROLLER --> BOOK Constructor Executed!!");
        }

        @GetMapping("/sayhi")
        public String sayHi(){
            return "Hi Folks!";
        }
    }

