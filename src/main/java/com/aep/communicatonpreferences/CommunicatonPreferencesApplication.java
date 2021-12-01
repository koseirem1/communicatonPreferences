package com.aep.communicatonpreferences;

import com.aep.communicatonpreferences.controller.ConstructorCommunicationController;
import com.aep.communicatonpreferences.controller.FieldCommunicationController;
import com.aep.communicatonpreferences.controller.SetterCommunicationController;
import com.aep.communicatonpreferences.controller.UnderSamePackageLevelComponent;
import com.aep.core.beans.DifferentLvelComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.aep.training","com.aep.core"}) ikili tarama yöntemi. ,k, paketide tarar. şu an bende training yok. o yüzden kullanamadım.

public class CommunicatonPreferencesApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CommunicatonPreferencesApplication.class, args);
        System.out.println("Aynı Paket Seviyesi ve Altı ------------------");
        UnderSamePackageLevelComponent underSamePackageLevelComponent = (UnderSamePackageLevelComponent) context.getBean("underSamePackageLevelComponent");
        underSamePackageLevelComponent.testMe();

        System.out.println("Farklı Paket Seviyesi ve Altı ------------------");
        DifferentLvelComponent differentLvelComponent = (DifferentLvelComponent) context.getBean("differentLvelComponent");
        differentLvelComponent.testMe();







    }

}
