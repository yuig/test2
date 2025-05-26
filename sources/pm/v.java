package pm;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class v extends y {

    /* renamed from: b */
    public final /* synthetic */ Method f100628b;

    /* renamed from: c */
    public final /* synthetic */ int f100629c;

    public v(int i13, Method method) {
        this.f100628b = method;
        this.f100629c = i13;
    }

    @Override // pm.y
    public final Object a(Class cls) {
        String b13 = ae.s.b(cls);
        if (b13 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(b13));
        }
        return this.f100628b.invoke(null, cls, Integer.valueOf(this.f100629c));
    }
}
