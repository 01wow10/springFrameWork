package cglib.service.interceptor;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyInterceptorForWaiter implements MethodInterceptor {
    private Object target;
    public MyInterceptorForWaiter(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        Object result = null;
        if(method.getName().equals("order")){
            System.out.println("您好，欢迎光临");
            result = proxy.invoke(target, args);
        }
        else if(method.getName().equals("pay")){
            result = proxy.invoke(target, args);
            System.out.println("请带好您的随身物品，慢走，欢迎再来");
        }
        return result;
    }
}
