package gm2;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kh2.n3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c0 extends y implements pm2.o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f65760a;

    public c0(Object recordComponent) {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        this.f65760a = recordComponent;
    }

    @Override // gm2.y
    public final Member b() {
        Object recordComponent = this.f65760a;
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        g01.a aVar = n3.f79628a;
        Method method = null;
        if (aVar == null) {
            Class<?> cls = recordComponent.getClass();
            try {
                aVar = new g01.a(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new g01.a(method, method);
            }
            n3.f79628a = aVar;
        }
        Method method2 = (Method) aVar.f63225b;
        if (method2 != null) {
            Object invoke = method2.invoke(recordComponent, new Object[0]);
            Intrinsics.g(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) invoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final pm2.p f() {
        Object recordComponent = this.f65760a;
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        g01.a aVar = n3.f79628a;
        Class cls = null;
        if (aVar == null) {
            Class<?> cls2 = recordComponent.getClass();
            try {
                aVar = new g01.a(cls2.getMethod("getType", new Class[0]), cls2.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new g01.a(cls, cls);
            }
            n3.f79628a = aVar;
        }
        Method method = (Method) aVar.f63224a;
        if (method != null) {
            Object invoke = method.invoke(recordComponent, new Object[0]);
            Intrinsics.g(invoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) invoke;
        }
        if (cls != null) {
            return new s(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
