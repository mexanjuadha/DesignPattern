package com.icehousecorp.gof.proxypatern.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by mexanjuadha on 3/24/16.
 */
public class FirstInvocationHandler implements InvocationHandler {

    private Employee employee;

    public FirstInvocationHandler(
        Employee employee) {
        this.employee = employee;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(employee, args);
            } else if (method.getName().equals("setGrade")) {
                throw new IllegalAccessException();

            }
        } catch (InvocationTargetException x) {
            x.printStackTrace();
        }
        return null;
    }
}
