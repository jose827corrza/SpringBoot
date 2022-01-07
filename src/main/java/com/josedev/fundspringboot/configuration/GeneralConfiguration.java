package com.josedev.fundspringboot.configuration;

import com.josedev.fundspringboot.bean.MyBeanWithProperties;
import com.josedev.fundspringboot.bean.MyBeanWithPropertiesImp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeneralConfiguration {

    @Value("${value.name}")
    private String name;

    @Value("${value.lastname}")
    private String lastname;

    @Value("${value.rol}")
    private String rol;

    //Un Bean para poder usarlas

    @Bean
    public MyBeanWithProperties function(){
        return new MyBeanWithPropertiesImp(name, lastname);
    }
}
