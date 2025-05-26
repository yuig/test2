package m40;

import c50.l3;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import pc.m;
import pc.m0;
import pc.u0;
import pc.v;

/* loaded from: classes5.dex */
public final class h implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g40.a f85826a = new g40.a(5, 0);

    @Override // pc.o0
    public final String a() {
        return "175f1e107051d520ac86689368cf11c33d59ec86ee84695eef3aa7d53b2ae1d8";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(n40.g.f89203a);
    }

    @Override // pc.o0
    public final String c() {
        return f85826a.a();
    }

    @Override // pc.o0
    public final m d() {
        m0 v13 = ep.b.v(l3.f26127a, "data", "name", "type");
        q0 q0Var = q0.f80391a;
        List list = o40.a.f92876a;
        List selections = o40.a.f92880e;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new m("data", v13, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == h.class;
    }

    public final int hashCode() {
        return k0.f80436a.b(h.class).hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "GetCountriesQuery";
    }
}
