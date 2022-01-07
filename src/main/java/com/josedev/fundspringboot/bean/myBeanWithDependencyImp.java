package com.josedev.fundspringboot.bean;

public class myBeanWithDependencyImp implements myBeanWithDependency{

    //Inyeccion de dependencia
    private myOperation myOp;

    public myBeanWithDependencyImp(myOperation myOp) {
        this.myOp = myOp;
    }

    @Override
    public void withDependency() {
        System.out.println(myOp.sum(3));
        System.out.println("Hola desde la implementacion de un bean con dependencia");
    }
}
