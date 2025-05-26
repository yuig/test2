package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f18606c = new d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f18607a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18608b = new HashMap();

    public static void d(HashMap hashMap, c cVar, q qVar, Class cls) {
        q qVar2 = (q) hashMap.get(cVar);
        if (qVar2 == null || qVar == qVar2) {
            if (qVar2 == null) {
                hashMap.put(cVar, qVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + cVar.f18598b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + qVar2 + ", new value " + qVar);
    }

    public final b a(Class cls, Method[] methodArr) {
        int i13;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).f18585b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : b(cls2).f18585b.entrySet()) {
                d(hashMap, (c) entry.getKey(), (q) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e13) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e13);
            }
        }
        boolean z13 = false;
        for (Method method : methodArr) {
            n0 n0Var = (n0) method.getAnnotation(n0.class);
            if (n0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i13 = 0;
                } else {
                    if (!z.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i13 = 1;
                }
                q value = n0Var.value();
                if (parameterTypes.length > 1) {
                    if (!q.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != q.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i13 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                d(hashMap, new c(i13, method), value, cls);
                z13 = true;
            }
        }
        b bVar = new b(hashMap);
        this.f18607a.put(cls, bVar);
        this.f18608b.put(cls, Boolean.valueOf(z13));
        return bVar;
    }

    public final b b(Class cls) {
        b bVar = (b) this.f18607a.get(cls);
        return bVar != null ? bVar : a(cls, null);
    }

    public final boolean c(Class cls) {
        HashMap hashMap = this.f18608b;
        Boolean bool = (Boolean) hashMap.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (((n0) method.getAnnotation(n0.class)) != null) {
                    a(cls, declaredMethods);
                    return true;
                }
            }
            hashMap.put(cls, Boolean.FALSE);
            return false;
        } catch (NoClassDefFoundError e13) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e13);
        }
    }
}
