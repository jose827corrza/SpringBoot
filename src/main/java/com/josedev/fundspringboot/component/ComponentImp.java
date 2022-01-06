package com.josedev.fundspringboot.component;

import com.josedev.fundspringboot.ComponentDependency;
import org.springframework.stereotype.Component;

@Component
public class ComponentImp implements ComponentDependency {
    @Override
    public void saludar() {
        System.out.println("Holandas!!");
    }
}
