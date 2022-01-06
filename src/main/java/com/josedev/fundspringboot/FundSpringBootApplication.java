package com.josedev.fundspringboot;

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

    //Dependency injection
    public FundSpringBootApplication(@Qualifier("componentImpV2") ComponentDependency componentDependency) {
        this.componentDependency = componentDependency;
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
        componentDependency.saludar();
    }
}
