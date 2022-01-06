package com.josedev.fundspringboot.component;

import com.josedev.fundspringboot.ComponentDependency;
import org.springframework.stereotype.Component;

@Component
public class ComponentImpV2 implements ComponentDependency {
    @Override
    public void saludar() {
        System.out.println("Holandas desde mi componente 2");
    }
}
