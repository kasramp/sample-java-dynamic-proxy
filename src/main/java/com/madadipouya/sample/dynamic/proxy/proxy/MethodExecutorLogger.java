package com.madadipouya.sample.dynamic.proxy.proxy;

import com.madadipouya.sample.dynamic.proxy.Service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MethodExecutorLogger implements InvocationHandler {

    private Service service;

    public MethodExecutorLogger(Service service) {
        this.service = service;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(String.format("Executing %s method", method.getName()));
        return method.invoke(service, args);
    }
}
