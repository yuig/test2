package lp2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class a implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Object f84243a;

    public a(Object obj) {
        this.f84243a = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2 = this.f84243a;
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, obj2.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(obj2, objArr);
        } catch (InvocationTargetException e13) {
            throw e13.getTargetException();
        } catch (ReflectiveOperationException e14) {
            throw new RuntimeException("Reflection failed for method " + method, e14);
        }
    }
}
