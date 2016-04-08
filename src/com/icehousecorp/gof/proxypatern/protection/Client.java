package com.icehousecorp.gof.proxypatern.protection;


import java.lang.reflect.Proxy;

/**
 * Created by mexanjuadha on 3/24/16.
 */
public class Client {

    private static final String TAG = Client.class.getSimpleName();

    public static void test() {

        Employee employee = new EmployeeImpl();
        employee.setName("A");
        employee.setGrade(10);
        Employee employeeProxy = getProxy(employee);

        try {
            employeeProxy.setGrade(11);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("test: Errro tidak bisa set grade grade anda sekarang" + employeeProxy.getGrade());
        }

        System.out.println("test: " + employeeProxy.getName());
        System.out.println("test: " + employeeProxy.getGrade());
    }

    public static Employee getProxy(Employee employee) {
        return (Employee) Proxy.newProxyInstance(
            employee.getClass().getClassLoader(),
            employee.getClass().getInterfaces(),
            new FirstInvocationHandler(employee));
    }


}
