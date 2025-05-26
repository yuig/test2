package pq2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class b1 implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f100995a = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f100996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f100997c;

    public b1(d1 d1Var, Class cls) {
        this.f100997c = d1Var;
        this.f100996b = cls;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f100995a;
        }
        m60.f0 f0Var = t0.f101085b;
        boolean m03 = f0Var.m0(method);
        Class cls = this.f100996b;
        if (m03) {
            return f0Var.l0(cls, obj, method, objArr);
        }
        w wVar = (w) this.f100997c.c(cls, method);
        return wVar.b(new g0(wVar.f101090a, obj, objArr, wVar.f101091b, wVar.f101092c), objArr);
    }
}
