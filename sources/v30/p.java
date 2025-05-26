package v30;

import c50.l2;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import n00.z;
import pc.j0;
import pc.m0;
import pc.v;

/* loaded from: classes3.dex */
public final class p implements j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final z f123946b = new z(17, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f123947a;

    public p(String followeeEntityId) {
        Intrinsics.checkNotNullParameter(followeeEntityId, "followeeEntityId");
        this.f123947a = followeeEntityId;
    }

    @Override // pc.o0
    public final String a() {
        return "a2fe99f86be7fcc40d5af4506911e2c43d7fdbac0e5d98c16e26a7048b5680c4";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(w30.n.f127913a);
    }

    @Override // pc.o0
    public final String c() {
        return f123946b.b();
    }

    @Override // pc.o0
    public final pc.m d() {
        m0 type = l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        q0 q0Var = q0.f80391a;
        List list = x30.b.f131610a;
        List selections = x30.b.f131614e;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", type, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(this, "value");
        writer.M0("followeeEntityId");
        pc.c.f99520a.d(writer, customScalarAdapters, this.f123947a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f123947a, ((p) obj).f123947a);
    }

    public final int hashCode() {
        return this.f123947a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "UnfollowUserMutation";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("UnfollowUserMutation(followeeEntityId="), this.f123947a, ")");
    }
}
