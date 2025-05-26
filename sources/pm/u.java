package pm;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class u extends y {

    /* renamed from: b */
    public final /* synthetic */ Method f100626b;

    /* renamed from: c */
    public final /* synthetic */ Object f100627c;

    public u(Object obj, Method method) {
        this.f100626b = method;
        this.f100627c = obj;
    }

    @Override // pm.y
    public final Object a(Class cls) {
        String b13 = ae.s.b(cls);
        if (b13 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(b13));
        }
        return this.f100626b.invoke(this.f100627c, cls);
    }
}
