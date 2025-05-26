package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ef implements pc.j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final pc f132358b = new pc(10, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f132359a;

    public ef(String contactRequestId) {
        Intrinsics.checkNotNullParameter(contactRequestId, "contactRequestId");
        this.f132359a = contactRequestId;
    }

    @Override // pc.o0
    public final String a() {
        return "831e98ea1f0d0a618c98bdbe9e739b30b5f1e3f54c867ab0ec6359ea9963f562";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.zd.f137695a);
    }

    @Override // pc.o0
    public final String c() {
        return f132358b.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = c50.l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.b0.f21792a;
        List selections = b50.b0.f21794c;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", type, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(this, "value");
        writer.M0("contactRequestId");
        pc.c.f99520a.d(writer, customScalarAdapters, this.f132359a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ef) && Intrinsics.d(this.f132359a, ((ef) obj).f132359a);
    }

    public final int hashCode() {
        return this.f132359a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "MarkContactRequestReadMutation";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("MarkContactRequestReadMutation(contactRequestId="), this.f132359a, ")");
    }
}
