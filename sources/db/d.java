package db;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54265a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f54266b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f54267c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(tn.b bVar) {
        this(bVar, 0);
        this.f54265a = 1;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        int i13 = this.f54265a;
        Object obj2 = this.f54267c;
        Object obj3 = this.f54266b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(obj, "obj");
                Intrinsics.checkNotNullParameter(method, "method");
                if (Intrinsics.d(method.getName(), "accept") && objArr != null && objArr.length == 1) {
                    rl2.d dVar = (rl2.d) obj3;
                    Object parameter = objArr[0];
                    Intrinsics.checkNotNullParameter(dVar, "<this>");
                    if (!dVar.b(parameter)) {
                        throw new ClassCastException("Value cannot be cast to " + dVar.e());
                    }
                    Intrinsics.g(parameter, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
                    Intrinsics.checkNotNullParameter(parameter, "parameter");
                    ((Function1) obj2).invoke(parameter);
                    return Unit.f80348a;
                }
                if (Intrinsics.d(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
                    return Boolean.valueOf(obj == objArr[0]);
                }
                if (Intrinsics.d(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
                    return Integer.valueOf(((Function1) obj2).hashCode());
                }
                if (Intrinsics.d(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                    return ((Function1) obj2).toString();
                }
                throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
            default:
                try {
                    Object invoke = method.invoke((sn.a) obj3, objArr);
                    Map map = (Map) obj2;
                    Boolean bool = (Boolean) map.get(method);
                    if (bool == null) {
                        String name = method.getName();
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        for (Class<?> cls = ((sn.a) obj3).getClass(); cls != null; cls = cls.getSuperclass()) {
                            if (((tn.c) cls.getDeclaredMethod(name, parameterTypes).getAnnotation(tn.c.class)) != null) {
                                ((Map) obj2).put(method, Boolean.TRUE);
                            } else {
                                continue;
                            }
                        }
                        map.put(method, Boolean.FALSE);
                        return invoke;
                    }
                    if (!bool.booleanValue()) {
                        return invoke;
                    }
                    if (!(invoke instanceof rn.b) || ((rn.b) invoke).f108811c.f34026a != 401) {
                        return invoke;
                    }
                    rn.b a13 = ((sn.a) obj3).a();
                    if (!a13.d()) {
                        return a13.f108809a == rn.c.NETWORK_ERROR ? a13 : invoke;
                    }
                    try {
                        return method.invoke((sn.a) obj3, objArr);
                    } catch (InvocationTargetException e13) {
                        throw e13.getTargetException();
                    }
                } catch (InvocationTargetException e14) {
                    throw e14.getTargetException();
                }
        }
    }

    public d(tn.b bVar, int i13) {
        this.f54265a = 1;
        this.f54266b = bVar;
        this.f54267c = new ConcurrentHashMap(0);
    }

    public d(rl2.d clazz, gb.b consumer) {
        this.f54265a = 0;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.f54266b = clazz;
        this.f54267c = consumer;
    }
}
