package b40;

import c50.l3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 implements pc.u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final n00.z f21708b = new n00.z(20, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f21709a;

    public g0(String newsId) {
        Intrinsics.checkNotNullParameter(newsId, "newsId");
        this.f21709a = newsId;
    }

    @Override // pc.o0
    public final String a() {
        return "b4a620d06b94e0102b9bdd43aec88de9a00ca4bea0e95579c2016067a0e46d73";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(c40.d0.f25710a);
    }

    @Override // pc.o0
    public final String c() {
        return f21708b.b();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 v13 = ep.b.v(l3.f26127a, "data", "name", "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = f40.c.f61059a;
        List selections = f40.c.f61063e;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", v13, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(this, "value");
        writer.M0("newsId");
        pc.c.f99520a.d(writer, customScalarAdapters, this.f21709a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && Intrinsics.d(this.f21709a, ((g0) obj).f21709a);
    }

    public final int hashCode() {
        return this.f21709a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "GetNewsSummaryQuery";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("GetNewsSummaryQuery(newsId="), this.f21709a, ")");
    }
}
