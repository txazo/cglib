//package net.sf.cglib.test;
//
//import net.sf.cglib.proxy.Factory;
//import net.sf.cglib.proxy.MethodInterceptor;
//import net.sf.cglib.proxy.MethodProxy;
//
//import java.lang.reflect.Method;
//
//public class UserServiceImpl$$EnhancerByCGLIB$$980faa7b
//        extends UserServiceImpl implements Factory {
//
//    // 方法拦截器
//    private MethodInterceptor CGLIB$CALLBACK_0;
//    // CGLIB$getUserName$0方法
//    private static final Method CGLIB$getUserName$0$Method;
//    // CGLIB$getUserName$0方法代理
//    private static final MethodProxy CGLIB$getUserName$0$Proxy;
//
//    final String CGLIB$getUserName$0(int paramInt) {
//        // 调用父类方法
//        return super.getUserName(paramInt);
//    }
//
//    public final String getUserName(int paramInt) {
//        MethodInterceptor interceptor = this.CGLIB$CALLBACK_0;
//        if (interceptor != null) {
//            // 执行方法拦截
//            return (String) interceptor.intercept(this, CGLIB$getUserName$0$Method,
//                    new Object[]{new Integer(paramInt)}, CGLIB$getUserName$0$Proxy);
//        }
//        // 无方法拦截器, 直接调用父类方法
//        return super.getUserName(paramInt);
//    }
//
//}
