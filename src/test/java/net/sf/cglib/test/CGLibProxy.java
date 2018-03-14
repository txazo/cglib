package net.sf.cglib.test;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibProxy implements MethodInterceptor {

    /**
     * @param targetClass 被代理父类
     */
    public <T> T getProxy(Class<T> targetClass) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetClass);
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }

    /**
     * @param object 代理类对象
     * @param method 被调用方法
     * @param args   方法参数
     * @param proxy  方法代理
     */
    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        Object result = null;
        // 拦截前
        // 调用父类方法
        result = proxy.invokeSuper(object, args);
        // 拦截后
        return result;
    }

}
