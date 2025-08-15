package cglib.service.interceptor;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyInterceptorForSale implements MethodInterceptor{
    private Object target;
    public MyInterceptorForSale(Object target){
        this.target = target;
    }
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        Object result = null;
        if(method.getName().equals("select"))
        {
            System.out.println("您好，欢迎光临");
            result = proxy.invoke(target, args);
        }
        else if(method.getName().equals("pay")){
            result = proxy.invoke(target, args);
            System.out.println("慢走，欢迎下次再来");
        }
        return result;
    }

}
