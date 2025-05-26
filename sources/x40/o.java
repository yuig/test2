package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements pc.j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final g40.a f132912b = new g40.a(26, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f132913a;

    public o(String contactRequestId) {
        Intrinsics.checkNotNullParameter(contactRequestId, "contactRequestId");
        this.f132913a = contactRequestId;
    }

    @Override // pc.o0
    public final String a() {
        return "b534e2e0a29986e083b8e239d3abac93ed2f05bbfd5348cf6069549dc5e991a0";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.m.f137265a);
    }

    @Override // pc.o0
    public final String c() {
        return f132912b.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = c50.l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.b.f21787a;
        List selections = b50.b.f21791e;
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
        pc.c.f99520a.d(writer, customScalarAdapters, this.f132913a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f132913a, ((o) obj).f132913a);
    }

    public final int hashCode() {
        return this.f132913a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "AcceptContactRequestMutation";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("AcceptContactRequestMutation(contactRequestId="), this.f132913a, ")");
    }
}
