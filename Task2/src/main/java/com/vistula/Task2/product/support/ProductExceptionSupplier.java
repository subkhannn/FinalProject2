package com.vistula.Task2.product.support;

import com.vistula.Task2.product.support.exception.ProductNotFoundException;

import java.util.function.Supplier;

public class ProductExceptionSupplier {
    public static Supplier<ProductNotFoundException> ProductNotFoundExceptionSupplier(Long id) {
        return () -> new ProductNotFoundException(id);
    }
}
