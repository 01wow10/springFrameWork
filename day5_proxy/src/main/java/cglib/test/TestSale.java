package cglib.test;

import cglib.service.SalesmanService;
import cglib.service.interceptor.MyInterceptorForSale;
import org.springframework.cglib.proxy.Enhancer;

public class TestSale {
    public static void main(String[] args) {
        SalesmanService salesmanService = new SalesmanService();
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(SalesmanService.class.getClassLoader());
        enhancer.setSuperclass(SalesmanService.class);
        enhancer.setCallback(new MyInterceptorForSale(salesmanService));
        SalesmanService proxy = (SalesmanService) enhancer.create();
        proxy.select();
        proxy.pay();
    }
}
