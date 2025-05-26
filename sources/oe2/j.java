package oe2;

import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class j extends kh2.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Method f94346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f94347b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f94348c;

    public j(Method method, Class cls, int i13) {
        this.f94346a = method;
        this.f94347b = cls;
        this.f94348c = i13;
    }

    @Override // kh2.w
    public final Object p0() {
        return this.f94346a.invoke(null, this.f94347b, Integer.valueOf(this.f94348c));
    }

    public final String toString() {
        return this.f94347b.getName();
    }
}
