package pm;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class w extends y {

    /* renamed from: b */
    public final /* synthetic */ Method f100630b;

    public w(Method method) {
        this.f100630b = method;
    }

    @Override // pm.y
    public final Object a(Class cls) {
        String b13 = ae.s.b(cls);
        if (b13 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(b13));
        }
        return this.f100630b.invoke(null, cls, Object.class);
    }
}
