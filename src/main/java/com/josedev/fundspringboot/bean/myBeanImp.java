package com.josedev.fundspringboot.bean;

public class myBeanImp implements myBean{
    @Override
    public void print() {
        System.out.println("Hola desde implementacion propia del bean");
    }
}
