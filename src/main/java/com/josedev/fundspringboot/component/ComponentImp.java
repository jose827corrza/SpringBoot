package com.josedev.fundspringboot.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImp implements ComponentDependency {
    @Override
    public void saludar() {
        System.out.println("Holandas!!");
    }
}
