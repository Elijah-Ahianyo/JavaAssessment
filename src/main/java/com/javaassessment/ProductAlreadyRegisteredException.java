package com.javaassessment;

public class ProductAlreadyRegisteredException extends  Exception {
    public ProductAlreadyRegisteredException(){
        super("Product already exist");
    }
}
