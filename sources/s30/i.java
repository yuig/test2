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
public final class i implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z f111034a = new z(14, 0);

    @Override // pc.o0
    public final String a() {
        return "6aa956b0f2723b7a87dd67630eaedf5acc2db201446a1adfcf795c68014ffbf0";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(t30.h.f116303a);
    }

    @Override // pc.o0
    public final String c() {
        return f111034a.b();
    }

    @Override // pc.o0
    public final pc.m d() {
        m0 v13 = ep.b.v(l3.f26127a, "data", "name", "type");
        q0 q0Var = q0.f80391a;
        List list = u30.a.f120138a;
        List selections = u30.a.f120143f;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", v13, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == i.class;
    }

    public final int hashCode() {
        return k0.f80436a.b(i.class).hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "AndroidCubesSignInQuery";
    }
}
