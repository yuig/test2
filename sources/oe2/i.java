package oe2;

import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class i extends kh2.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Method f94342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f94343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Class f94344c;

    public i(Method method, Object obj, Class cls) {
        this.f94342a = method;
        this.f94343b = obj;
        this.f94344c = cls;
    }

    @Override // kh2.w
    public final Object p0() {
        return this.f94342a.invoke(this.f94343b, this.f94344c);
    }

    public final String toString() {
        return this.f94344c.getName();
    }
}
