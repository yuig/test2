package y30;

import c50.l3;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import n00.z;
import pc.m0;
import pc.u0;

/* loaded from: classes5.dex */
public final class p implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z f136761a = new z(18, 0);

    @Override // pc.o0
    public final String a() {
        return "767b2a9f3b96480a8273b0950947ef7e98f7313633ca89d05d96fadbea414e51";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(z30.o.f140782a);
    }

    @Override // pc.o0
    public final String c() {
        return f136761a.b();
    }

    @Override // pc.o0
    public final pc.m d() {
        m0 v13 = ep.b.v(l3.f26127a, "data", "name", "type");
        q0 q0Var = q0.f80391a;
        List list = a40.a.f527a;
        List selections = a40.a.f537k;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", v13, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == p.class;
    }

    public final int hashCode() {
        return k0.f80436a.b(p.class).hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "GetRecommendedTodayArticlesQuery";
    }
}
