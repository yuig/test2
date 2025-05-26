package rn2;

import am2.d0;
import am2.o0;
import java.util.Collection;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xk2.v;

/* loaded from: classes2.dex */
public final class f implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f f108911a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final ym2.g f108912b;

    /* renamed from: c, reason: collision with root package name */
    public static final q0 f108913c;

    /* renamed from: d, reason: collision with root package name */
    public static final v f108914d;

    static {
        ym2.g g13 = ym2.g.g(b.ERROR_MODULE.getDebugText());
        Intrinsics.checkNotNullExpressionValue(g13, "special(...)");
        f108912b = g13;
        f108913c = q0.f80391a;
        f108914d = xk2.m.b(e.f108910i);
    }

    @Override // am2.d0
    public final o0 H(ym2.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // am2.d0
    public final boolean O(d0 targetModule) {
        Intrinsics.checkNotNullParameter(targetModule, "targetModule");
        return false;
    }

    @Override // am2.m
    /* renamed from: a */
    public final am2.m o0() {
        return this;
    }

    @Override // am2.d0
    public final xl2.l f() {
        return (xl2.l) f108914d.getValue();
    }

    @Override // am2.m
    public final am2.m g() {
        return null;
    }

    @Override // am2.d0
    public final Object g0(fi.b capability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        return null;
    }

    @Override // bm2.a
    public final bm2.i getAnnotations() {
        return bm2.h.f23540a;
    }

    @Override // am2.m
    public final ym2.g getName() {
        return f108912b;
    }

    @Override // am2.d0
    public final Collection i(ym2.c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return q0.f80391a;
    }

    @Override // am2.d0
    public final List k0() {
        return f108913c;
    }

    @Override // am2.m
    public final Object l0(ul2.e visitor, Object obj) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return null;
    }
}
