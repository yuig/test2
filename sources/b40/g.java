package b40;

import c50.l2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements pc.j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final n00.z f21707a = new n00.z(19, 0);

    @Override // pc.o0
    public final String a() {
        return "6e9f1240c6c6955fb7a15982f170670a5112104004621321467df19c55fd24e9";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(c40.f.f25715a);
    }

    @Override // pc.o0
    public final String c() {
        return f21707a.b();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = f40.a.f61048a;
        List selections = f40.a.f61051d;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", type, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == g.class;
    }

    public final int hashCode() {
        return kotlin.jvm.internal.k0.f80436a.b(g.class).hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "DeleteNewsHubBadgeMutation";
    }
}
