package com.josedev.fundspringboot.bean;

public class myOperationImp implements myOperation{
    @Override
    public int sum(int number) {
        return number + 1;
    }
}
