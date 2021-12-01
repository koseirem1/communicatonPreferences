package com.aep.communicatonpreferences.scopesample;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@RestController
    @Scope(WebApplicationContext.SCOPE_SESSION)
//Scope(WebApplicationContext.SCOPE_REQUEST)
//@Scope("request")
    public class BookController implements InitializingBean, DisposableBean {

        public BookController(){

            System.out.println("REST CONTROLLER --> BOOK Constructor Executed!!");
        }

        @GetMapping("/sayhi")
        public String sayHi(){

            return "Hi Folks!";
        }

        @PostConstruct
        public void postCons(){
            System.out.println("REST CONTROLLER --> BOOK Post Consturtor executed");
        }

        @PreDestroy
        public void preDestroy(){
            System.out.println("REST CONTROLLER --> BOOK Pre Destroy executed");
        }

        @Override
        public void afterPropertiesSet() throws Exception {
            System.out.println("REST CONTROLLER --> BOOK afterPropertiesSet executed");
        }

        @Override
        public void destroy() throws Exception {
            System.out.println("REST CONTROLLER --> BOOK destroy executed");
        }

    }

