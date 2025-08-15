package cglib.test;

import cglib.service.SalesmanService;
import cglib.service.WaiterService;
import cglib.service.interceptor.MyInterceptorForSale;
import cglib.service.interceptor.MyInterceptorForWaiter;
import org.springframework.cglib.proxy.Enhancer;

public class TestWaiter {
    public static void main(String[] args) {
        WaiterService waiterService = new WaiterService();
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(WaiterService.class.getClassLoader());
        enhancer.setSuperclass(WaiterService.class);
        enhancer.setCallback(new MyInterceptorForWaiter(waiterService));
        WaiterService proxy = (WaiterService) enhancer.create();
        proxy.order();
        proxy.pay();
    }
}
