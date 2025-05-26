package s30;

import c50.l3;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import n00.z;
import pc.m0;
import pc.u0;
import pc.v;

/* loaded from: classes2.dex */
public final class t implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z f111054a = new z(15, 0);

    @Override // pc.o0
    public final String a() {
        return "64c4e2e15fb5ef28a9792fd75a309a149a2fa84763961c6819a67e5d63fe6364";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(t30.r.f116319a);
    }

    @Override // pc.o0
    public final String c() {
        return f111054a.b();
    }

    @Override // pc.o0
    public final pc.m d() {
        m0 v13 = ep.b.v(l3.f26127a, "data", "name", "type");
        q0 q0Var = q0.f80391a;
        List list = u30.b.f120144a;
        List selections = u30.b.f120151h;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", v13, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == t.class;
    }

    public final int hashCode() {
        return k0.f80436a.b(t.class).hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "GoogleEngage";
    }
}
