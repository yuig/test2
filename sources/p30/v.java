package p30;

import c50.l2;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import n00.z;
import pc.j0;
import pc.m0;

/* loaded from: classes2.dex */
public final class v implements j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final z f98759b = new z(13, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f98760a;

    public v(String inviteCode) {
        Intrinsics.checkNotNullParameter(inviteCode, "inviteCode");
        this.f98760a = inviteCode;
    }

    @Override // pc.o0
    public final String a() {
        return "5e36cdc4c3e6f50873d61e0eb90ffb5e18a614e27596a9df74dc42b3d97e3ef7";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(q30.s.f102302a);
    }

    @Override // pc.o0
    public final String c() {
        return f98759b.b();
    }

    @Override // pc.o0
    public final pc.m d() {
        m0 type = l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        q0 q0Var = q0.f80391a;
        List list = r30.c.f106085a;
        List selections = r30.c.f106089e;
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
        writer.M0("inviteCode");
        pc.c.f99520a.d(writer, customScalarAdapters, this.f98760a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f98760a, ((v) obj).f98760a);
    }

    public final int hashCode() {
        return this.f98760a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "RedeemInviteMutation";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("RedeemInviteMutation(inviteCode="), this.f98760a, ")");
    }
}
