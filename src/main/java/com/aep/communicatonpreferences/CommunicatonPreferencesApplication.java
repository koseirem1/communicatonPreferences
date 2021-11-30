package com.aep.communicatonpreferences;

import com.aep.communicatonpreferences.controller.ConstructorCommunicationController;
import com.aep.communicatonpreferences.controller.FieldCommunicationController;
import com.aep.communicatonpreferences.controller.SetterCommunicationController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CommunicatonPreferencesApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CommunicatonPreferencesApplication.class, args);
       /* FieldCommunicationController fieldCommunicationController = (FieldCommunicationController) context.getBean("fieldCommunicationController");
        fieldCommunicationController.handleMessage(); */

     /*   SetterCommunicationController setterCommunicationController = (SetterCommunicationController)context.getBean("setterCommunicationController");
        setterCommunicationController.handleMessage(); */

        ConstructorCommunicationController communicationController = (ConstructorCommunicationController) context.getBean("constructorCommunicationController");
        communicationController.handleMessage();

    }

}
