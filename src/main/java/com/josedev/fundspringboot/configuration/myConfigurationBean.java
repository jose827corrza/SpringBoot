package com.josedev.fundspringboot.configuration;

import com.josedev.fundspringboot.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class myConfigurationBean {

    @Bean
    public myBean beanConfiguration(){
        return new myBeanImp();
    }


    @Bean
    public myOperation beanConfigurationOperation(){
        return new myOperationImp();
    }

    @Bean
    public myBeanWithDependency beanConfigurationOperationWithDependency(myOperation myOp){
        return new myBeanWithDependencyImp(myOp);

    }
}
