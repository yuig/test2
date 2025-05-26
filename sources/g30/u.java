package g30;

import c50.l2;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import n00.z;
import pc.j0;
import pc.m0;
import pc.v;

/* loaded from: classes2.dex */
public final class u implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z f63440a = new z(9, 0);

    @Override // pc.o0
    public final String a() {
        return "97bb7a8b8700b8f4f7819f115d3cc2cf8ee0f0487ec880c31034e58c56a2bf0c";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(h30.r.f66798a);
    }

    @Override // pc.o0
    public final String c() {
        return f63440a.b();
    }

    @Override // pc.o0
    public final pc.m d() {
        m0 type = l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        q0 q0Var = q0.f80391a;
        List list = i30.c.f71460a;
        List selections = i30.c.f71463d;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", type, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == u.class;
    }

    public final int hashCode() {
        return k0.f80436a.b(u.class).hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "ResendUserEmailMutation";
    }
}
