package com.vistula.Task2.product.support.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long id) {
        super(String.format("Product not found with id %d", id));
    }
  }
