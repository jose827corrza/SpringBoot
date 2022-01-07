package com.josedev.fundspringboot;

import com.josedev.fundspringboot.bean.MyBeanWithProperties;
import com.josedev.fundspringboot.bean.myBean;
import com.josedev.fundspringboot.bean.myBeanWithDependency;
import com.josedev.fundspringboot.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundSpringBootApplication implements CommandLineRunner {

    /**
     * Important to specify if a dependency is used in more than one class
     * using @Qualifier, we specify the dependency that we want to use
     */
    private ComponentDependency componentDependency;
    private myBean myBeanDependency;
    private myBeanWithDependency myBDependency;
    private MyBeanWithProperties myBeanWithProperties;

    //Dependency injection
    public FundSpringBootApplication(@Qualifier("componentImpV2") ComponentDependency componentDependency,
                                     myBean myBeanDependency,
                                     myBeanWithDependency myBDependency,
                                     MyBeanWithProperties myBeanWithProperties) {
        this.componentDependency = componentDependency;
        this.myBeanDependency = myBeanDependency;
        this.myBDependency = myBDependency;
        this.myBeanWithProperties = myBeanWithProperties;
        //Inyeccion de dependencia
    }

    public static void main(String[] args) {
        SpringApplication.run(FundSpringBootApplication.class, args);
    }


    /**
     * Excecutates in app
     * whatever we want
     * Used our implementation inside another object
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        //Llamar su implementacion
        componentDependency.saludar();
        myBeanDependency.print();
        myBDependency.withDependency();
        System.out.println(myBeanWithProperties.function());
    }
}
